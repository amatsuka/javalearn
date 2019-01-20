package com.amatsuka.procedural.arrays;

import com.amatsuka.contracts.RunnableExercise;
import com.amatsuka.utils.Arrays;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Scanner;


/*
Написать функцию linearize,
которая принимает в качестве параметра двумерный массив
и возвращает одномерный массив со всеми элементами двумерного.
 */
public class ex4_Linearize implements RunnableExercise {
    @Override
    public void run() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите размер массива");

        int size = sc.nextInt();

        int[][] array = new int[size][];

        for (int i = 0; i < size; i++) {
            array[i] = Arrays.readIntegerArray(System.in);
        }

        System.out.println(Arrays.join(" ", linearize(array)));

    }

    private int[] linearize(final int[][] array) {
        int[] res = array[0];

        for (int i = 1; i < array.length; i++) {
            /**
             * @TODO Заменить на merge без смешивания массивов
             */
            res = Arrays.merge(res, array[i]);
        }

        return res;
    }

    @Override
    public String description() {
        return "Функция linearize";
    }
}
