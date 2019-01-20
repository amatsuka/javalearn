package com.amatsuka.utils;


import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Arrays {

    public static String join(String separator,int[] array) {
        return java.util.Arrays.stream(array)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(separator));
    }

    public static int[] readIntegerArray(InputStream stream) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите элементы массива через пробел. Для завершения ввода нажмите  Enter");

        String inputString = sc.nextLine();

        ArrayList<Integer> input = new ArrayList<>();

        for (String number : inputString.split(" ")) {
            try {
                input.add(Integer.parseInt(number));
            } catch (NumberFormatException e) {
                System.out.println("Не удалось прочитать как число " + number);
            }
        }

        return input.stream().mapToInt(i -> i).toArray();
    }
}
