package com.amatsuka;


import com.amatsuka.excercies.concurrent.hw1.Ex1_FileDownloader;
import com.amatsuka.excercies.concurrent.hw1.Ex2_PriorityAndParams;
import com.amatsuka.excercies.concurrent.hw2.Ex1_RandomList;
import com.amatsuka.excercies.java8.hw1.Ex1_FindStringWithMaxLetters;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static final String RESOURCES = "src/main/resources";

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        (new Ex1_FindStringWithMaxLetters()).run();

       /* CompletableFuture<String> future1
                = CompletableFuture.supplyAsync(() -> "Hello");
        CompletableFuture<String> future2
                = CompletableFuture.supplyAsync(() -> "Beautiful");
        CompletableFuture<String> future3
                = CompletableFuture.supplyAsync(() -> "World");

        CompletableFuture<Void> combinedFuture
                = CompletableFuture.allOf(future1, future2, future3);


        String combined = Stream.of(future1, future2, future3)
                .map(CompletableFuture::join)
                .collect(Collectors.joining(" "));

        System.out.println(combined);*/
    }
}
