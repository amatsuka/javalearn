package com.amatsuka.excercies.concurrent.hw1;

import com.amatsuka.Main;
import com.amatsuka.contracts.RunnableExercise;
import com.github.javafaker.Faker;

import java.io.*;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.*;


/*
Напишите программу, которая в несколько потоков скачивает файлы по заданному списку URL-адресов. Скачать файл можно например так:
BufferedInputStream in = new BufferedInputStream(new URL(FILE_URL).openStream())
 */
public class Ex1_FileDownloader implements RunnableExercise {
    @Override
    public void run() {
        List<String> filesToDownload = this.getFileNames(20);

        ExecutorService executor = Executors.newCachedThreadPool();

        for (String fileUrl : filesToDownload) {
            CompletableFuture<InputStream> future = CompletableFuture.supplyAsync(new FileDownloader(fileUrl), executor);
            future.thenApply(Ex1_FileDownloader::saveFile).thenAccept(FileDownloader::closeStream);
        }


        System.out.println("threads started");
        //TODO как завершить потоки при таком подходе?
        executor.shutdown();

    }

    private static InputStream saveFile(InputStream inputStream) {
        Faker faker = new Faker();

        File targetFile = new File(Paths.get(Main.RESOURCES, faker.name().firstName()).toString() + ".jpg");
        try (OutputStream outStream = new FileOutputStream(targetFile)) {
            System.out.println(targetFile + " save start");


            outStream.write(inputStream.readAllBytes());
            System.out.println(targetFile + " saved");
        } catch (IOException e) {
            e.printStackTrace();
        }


        return inputStream;
    }

    private List<String> getFileNames(int limit) {
        List<String> result = new LinkedList<>();
        Faker faker = new Faker();

        for (int i = 0; i < limit; i++) {
            result.add(faker.avatar().image());
        }

        return result;
    }

    @Override
    public String description() {
        return "Программа, которая в несколько потоков скачивает файлы";
    }
}
