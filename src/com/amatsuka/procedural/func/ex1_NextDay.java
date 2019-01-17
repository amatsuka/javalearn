package com.amatsuka.procedural.func;

import com.amatsuka.utils.Dates;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

/*
 * Имеются три числа - день, месяц и год, вводимые пользователем с консоли.
 * Вывести дату следующего дня в формате "День.Месяц.Год".
 * Учесть переход на следующий месяц, а также следующий год.
 * Форматирование строки "День.Месяц.Год" вынести в отдельную функцию.
 */

public class ex1_NextDay {

    private static byte MAX_MONTH_IN_YEAR = 12;

    public void run() {
        Scanner sc = new Scanner(System.in);

        int day = sc.nextInt();
        int month = sc.nextInt();
        int year = sc.nextInt();

        System.out.println(getNextDayDate(day, month, year));
    }

    private String getNextDayDate(final int day, final int month, final int year) {
        int maxDayInMonth = Dates.getMaxDayInMonth(month, year);

        if (day < maxDayInMonth) return getStringDate(day + 1, month, year);


        if (month < MAX_MONTH_IN_YEAR) return getStringDate(1, month + 1, year);

        return getStringDate(1, 1, year + 1);
    }

    private String getStringDate(final int day, final int month, final int year) {
        return Arrays.stream(new int[]{day, month, year})
                .mapToObj(String::valueOf)
                .collect(Collectors.joining("."));
    }




}
