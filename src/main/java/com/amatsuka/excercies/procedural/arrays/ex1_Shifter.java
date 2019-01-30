package com.amatsuka.excercies.procedural.arrays;

import com.amatsuka.contracts.RunnableExercise;
import com.amatsuka.utils.Arrays;

/*
Напишите программу, которая циклически сдвигает элементы массива вправо на одну позицию, и печатает результат.
Цикличность означает, что последний элемент массива становится самым первым его элементом.
 */
public class ex1_Shifter implements RunnableExercise {
    @Override
    public void run() {
        printAllShiftStatesOfArray(Arrays.readIntegerArray(System.in));
    }

    private void printAllShiftStatesOfArray(final int[] array) {

        int[] shiftedArray = Arrays.shiftRight(array);
        System.out.println(Arrays.join(" ", shiftedArray));

        for (int i = 1; i < array.length; i++) {
            shiftedArray = Arrays.shiftRight(shiftedArray);
            System.out.println(Arrays.join(" ", shiftedArray));
        }
    }

    @Override
    public String description() {
        return "Циклически сдвигает элементы массива";
    }
}
