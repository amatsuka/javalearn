package com.amatsuka.procedural.arrays;

import com.amatsuka.contracts.RunnableExercise;
import com.amatsuka.utils.Arrays;

import java.util.ArrayList;
import java.util.Scanner;

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

        int[] shiftedArray = shift(array);
        System.out.println(Arrays.join(" ", shiftedArray));

        for (int i = 1; i < array.length; i++) {
            shiftedArray = shift(shiftedArray);
            System.out.println(Arrays.join(" ", shiftedArray));
        }
    }

    private int[] shift(int[] array) {
        int[] shiftedArray = new int[array.length];

        shiftedArray[0] = array[array.length - 1];

        for (int i = 0; i < array.length - 1; i++) {
            shiftedArray[i + 1] = array[i];
        }

        return shiftedArray;
    }

    @Override
    public String description() {
        return "Циклически сдвигает элементы массива";
    }
}