package com.amatsuka.procedural.func;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ex1_NextDay {
    public void run() {
        Scanner sc = new Scanner(System.in);

        int day = sc.nextInt();
        int month = sc.nextInt();
        int year = sc.nextInt();
    }

    private String getNextDayDate(final int day, final int month, final int year) {
        if (day < 28) return getStringDate(day, month, year);


    }

    private String getStringDate(final int day, final int month, final int year) {
        return Arrays.stream(new int[]{day, month, year})
                .mapToObj(String::valueOf)
                .collect(Collectors.joining("."));
    }

    private int getMaxDayInMonth(final int month, final int year) {

    }


}
