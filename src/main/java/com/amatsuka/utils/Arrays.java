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

    public static int[] merge(int[] firstArray, int[] secondArray) {
        ArrayList<Integer> result = new ArrayList<>();

        int index = 0;

        while ((index < firstArray.length) || (index < secondArray.length)) {
            if (index < firstArray.length) {
                result.add(firstArray[index]);
            }

            if (index < secondArray.length) {
                result.add(secondArray[index]);
            }

            index++;
        }

        return result.stream().mapToInt(i -> i).toArray();

    }


    public static int[] shiftRight(int[] array) {
        int[] shiftedArray = new int[array.length];

        shiftedArray[0] = array[array.length - 1];

        for (int i = 0; i < array.length - 1; i++) {
            shiftedArray[i + 1] = array[i];
        }

        return shiftedArray;
    }

    public static int[] unique(int[] array) {
        ArrayList<Integer> processedValues = new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            Integer value = array[i];

            if (!processedValues.contains(value)) {
                result.add(value);
            }

            processedValues.add(value);
        }

        return result.stream().mapToInt(i -> i).toArray();
    }
}
