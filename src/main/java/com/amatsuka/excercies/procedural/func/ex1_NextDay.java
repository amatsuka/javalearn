package com.amatsuka.excercies.procedural.func;

import com.amatsuka.contracts.RunnableExercise;
import com.amatsuka.utils.Dates;
import com.amatsuka.utils.Input;

import java.io.InputStream;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;
import java.util.stream.Collectors;

/*
 * Имеются три числа - день, месяц и год, вводимые пользователем с консоли.
 * Вывести дату следующего дня в формате "День.Месяц.Год".
 * Учесть переход на следующий месяц, а также следующий год.
 * Форматирование строки "День.Месяц.Год" вынести в отдельную функцию.
 */

public class ex1_NextDay implements RunnableExercise {

    public void run() {
        InputStream inputStream = System.in;

        int day = Input.readInt(inputStream, "Ведите день");
        int month = Input.readInt(inputStream, "Ведите месяц");
        int year = Input.readInt(inputStream, "Ведите год");

        System.out.println(Dates.getNextDayDate(day, month, year));
    }

    @Override
    public String description() {
        return "Вывести дату следующего дня в формате \"День.Месяц.Год\"";
    }






}
