package com.amatsuka.procedural.arrays;

import com.amatsuka.contracts.RunnableExercise;
import com.amatsuka.utils.Arrays;

import java.util.ArrayList;

/*
Написать программу, удаляющую все повторяющиеся целые числа из массива и печатающую результат.
 */
public class ex2_RemoveRepeat implements RunnableExercise {
    @Override
    public void run() {
        int[] array = Arrays.readIntegerArray(System.in);

        ArrayList<Integer> processedValues = new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            Integer value = array[i];

            if (!processedValues.contains(value)) {
                result.add(value);
            }

            processedValues.add(value);
        }

        System.out.println(Arrays.join(" ", result.stream().mapToInt(i -> i).toArray()));
    }

    @Override
    public String description() {
        return "Удаление все повторяющихся целых числа из массива";
    }
}
