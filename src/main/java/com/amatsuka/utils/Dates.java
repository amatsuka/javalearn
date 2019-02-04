package com.amatsuka.utils;

import java.util.Arrays;
import java.util.stream.Collectors;

public abstract class Dates {

    private static byte MAX_MONTH_IN_YEAR = 12;

    public static boolean isHighYear(final int year) {
         if ((year%100 == 0) && !(year%400 == 0)) return false;

         return year%4 == 0;
    }

    public static int getMaxDayInMonth(final int month, final int year) {
        //Апрель, июнь, сентябрь, ноябрь - 30 дней
        // Февраль - 28 дней в обычный год, 29 дней в високосный

        switch (month) {
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
                return isHighYear(year) ? 29 : 28;
        }

        return 31;
    }

    public static String getNextDayDate(final int day, final int month, final int year) {
        int maxDayInMonth = Dates.getMaxDayInMonth(month, year);

        if (day < maxDayInMonth) return getStringDate(day + 1, month, year);


        if (month < MAX_MONTH_IN_YEAR) return getStringDate(1, month + 1, year);

        return getStringDate(1, 1, year + 1);
    }

    public static String getStringDate(final int day, final int month, final int year) {
        return Arrays.stream(new int[]{day, month, year})
                .mapToObj(String::valueOf)
                .collect(Collectors.joining("."));
    }
}
