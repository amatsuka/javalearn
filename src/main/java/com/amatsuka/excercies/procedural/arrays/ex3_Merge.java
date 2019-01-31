package com.amatsuka.excercies.procedural.arrays;

import com.amatsuka.contracts.RunnableExercise;
import com.amatsuka.utils.Arrays;
import com.amatsuka.utils.Input;


/*
Заданы 2 массива целых чисел произвольной длины.
Написать программу, создающую третий массив, представляющий собой слияние 2-х заданных. Пример:
 */
public class ex3_Merge implements RunnableExercise {
    @Override
    public void run() {
        int[] firstArray = Input.readIntegerArray(System.in);
        int[] secondArray = Input.readIntegerArray(System.in);

        System.out.println(Arrays.join(" ", Arrays.merge(firstArray, secondArray)));

    }

    @Override
    public String description() {
        return "Слияние 2-х заданных";
    }
}
