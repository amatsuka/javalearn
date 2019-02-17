package com.amatsuka.excercies.io;

import com.amatsuka.Main;
import com.amatsuka.contracts.RunnableExercise;
import com.github.javafaker.Faker;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.List;

/*
Создать программно и заполнить файл случайными целыми числами.
Отсортировать содержимое файла по возрастанию.
 */
public class Ex2_RandomFile implements RunnableExercise {
    @Override
    public void run() {
        Path filePath = Paths.get(Main.RESOURCES, "random.txt");

        fillFile(filePath);

        sortFileContent(filePath);

        showFileContent(filePath);
    }

    private void fillFile(Path filePath) {
        try (DataOutputStream dataOutputStream = createFileOutputStream(filePath)) {

            fillFileOfRandomNumbers(dataOutputStream, 20);
        } catch (IOException e) {
            System.out.println("Не удалось записать файл");
        }
    }

    private void sortFileContent(Path filePath) {

        List<Integer> fileContent;

        try (DataInputStream dataInputStream = createFileInputStream(filePath)) {

            fileContent = readFileToList(dataInputStream);

        } catch (IOException e) {
            System.out.println("Не удалось прочитать файл");
            return;
        }

        fileContent.sort(Integer::compareTo);

        try (DataOutputStream dataOutputStream = createFileOutputStream(filePath)) {

            writeListToFile(dataOutputStream, fileContent);
        } catch (IOException e) {
            System.out.println("Не удалось записать файл");
        }
    }

    private void showFileContent(Path filePath) {
        try (DataInputStream dataInputStream = createFileInputStream(filePath)) {

            System.out.println(readFileToList(dataInputStream));

        } catch (IOException e) {
            System.out.println("Не удалось прочитать файл");
        }
    }

    private DataOutputStream createFileOutputStream(Path filePath) throws IOException {
        return new DataOutputStream(Files.newOutputStream(filePath));
    }

    private void fillFileOfRandomNumbers(DataOutputStream file, final int limit) throws IOException {
        Faker faker = new Faker();

        for (int i = 0; i < limit; i++) {
            file.writeInt(faker.number().numberBetween(Integer.MIN_VALUE, Integer.MAX_VALUE));
        }

        file.flush();
    }

    private DataInputStream createFileInputStream(Path filePath) throws IOException {
        return new DataInputStream(Files.newInputStream(filePath));
    }

    private List<Integer> readFileToList(DataInputStream file) throws IOException {
        List<Integer> result = new LinkedList<>();

        while (file.available() > 0) {
            result.add(file.readInt());
        }

        return result;
    }

    private void writeListToFile(DataOutputStream file, List<Integer> list) throws IOException {

        for (Integer integer : list) {
            file.writeInt(integer);
        }

        file.flush();
    }

    @Override
    public String description() {
        return "Заполнить файл случайными целыми числами";
    }
}
