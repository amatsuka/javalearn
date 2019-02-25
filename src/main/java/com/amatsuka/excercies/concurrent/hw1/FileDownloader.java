package com.amatsuka.excercies.concurrent.hw1;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.function.Supplier;

class FileDownloader implements Supplier<InputStream> {

    private String fileUrl;

    public FileDownloader(String fileUrl) {
        this.fileUrl = fileUrl;
    }

    @Override
    public InputStream get() {
        System.out.println(this.fileUrl + " start open stream");

        InputStream stream = null;

        try {
            stream = new BufferedInputStream(new URL(this.fileUrl).openStream());

            System.out.println(this.fileUrl + " stream opened");
        } catch (IOException e) {
            System.out.println(this.fileUrl + " stream open failed");

        }

        return stream;
    }

    public static void closeStream(InputStream inputStream) {
        try {
            inputStream.close();

            System.out.println("Stream closed");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}