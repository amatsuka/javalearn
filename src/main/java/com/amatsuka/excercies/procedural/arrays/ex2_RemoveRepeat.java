package com.amatsuka.excercies.procedural.arrays;

import com.amatsuka.contracts.RunnableExercise;
import com.amatsuka.utils.Arrays;
import com.amatsuka.utils.Input;

import java.util.ArrayList;

/*
Написать программу, удаляющую все повторяющиеся целые числа из массива и печатающую результат.
 */
public class ex2_RemoveRepeat implements RunnableExercise {
    @Override
    public void run() {
        int[] array = Input.readIntegerArray(System.in);

        System.out.println(Arrays.join(" ", Arrays.unique(array)));
    }

    @Override
    public String description() {
        return "Удаление все повторяющихся целых числа из массива";
    }
}
