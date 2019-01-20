package com.amatsuka.utils;


import java.util.stream.Collectors;

public class Arrays {

    public static String join(String separator,int[] array) {
        return java.util.Arrays.stream(array)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(separator));
    }
}
