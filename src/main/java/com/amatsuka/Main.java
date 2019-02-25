package com.amatsuka;


import com.amatsuka.excercies.concurrent.hw1.Ex1_FileDownloader;

public class Main {

    public static final String RESOURCES = "src/main/resources";

    public static void main(String[] args) {
        (new Ex1_FileDownloader()).run();
    }
}
