package com.amatsuka.utils;

import java.io.InputStream;
import java.util.ArrayList;
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

    public static int[] readIntegerArray(InputStream stream) {
        return readIntegerArray(stream, "Введите элементы массива через пробел. Для завершения ввода нажмите  Enter");
    }

    public static int[] readIntegerArray(InputStream stream, String message) {
        Scanner sc = new Scanner(stream);

        System.out.println(message);

        String inputString = sc.nextLine();

        ArrayList<Integer> input = new ArrayList<>();

        for (String number : inputString.split(" ")) {
            try {
                input.add(Integer.parseInt(number));
            } catch (NumberFormatException e) {
                System.err.println("Не удалось прочитать как число " + number);
            }
        }

        return input.stream().mapToInt(i -> i).toArray();
    }
}
