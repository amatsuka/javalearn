package com.amatsuka.utils;

import java.io.InputStream;
import java.util.Scanner;

public class Input {

    private static Scanner makeScanner(InputStream inputStream) {
        return new Scanner(inputStream);
    }

    public static int readInt(InputStream inputStream, String message) {
        System.out.println(message);
        return makeScanner(inputStream).nextInt();
    }

    public static int readInt(InputStream inputStream) {
        return readInt(inputStream, "Введите целое число");
    }

    public static String readString(InputStream inputStream, String message) {
        System.out.println(message);
        return makeScanner(inputStream).nextLine();
    }

    public static String readString(InputStream inputStream) {
        return readString(inputStream, "Введите строку");
    }
}
