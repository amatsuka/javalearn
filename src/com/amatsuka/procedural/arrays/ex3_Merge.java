package com.amatsuka.procedural.arrays;

import com.amatsuka.contracts.RunnableExercise;
import com.amatsuka.utils.Arrays;

import java.util.ArrayList;


/*
Заданы 2 массива целых чисел произвольной длины.
Написать программу, создающую третий массив, представляющий собой слияние 2-х заданных. Пример:
 */
public class ex3_Merge implements RunnableExercise {
    @Override
    public void run() {
        int[] firstArray = Arrays.readIntegerArray(System.in);
        int[] secondArray = Arrays.readIntegerArray(System.in);

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

        System.out.println(Arrays.join(" ", result.stream().mapToInt(i -> i).toArray()));

    }

    @Override
    public String description() {
        return "Слияние 2-х заданных";
    }
}
