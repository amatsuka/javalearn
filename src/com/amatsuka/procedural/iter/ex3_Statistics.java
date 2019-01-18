package com.amatsuka.procedural.iter;

/*
    Написать программу, отображающую статистику по осадкам за N дней. N вводится пользователем.
    Пользователь также должен ввести N целых чисел, обозначающих величину осадков в день.
    Программа должна выводить:
    a. Количество дней
    b. Сумму осадков за этот период
    c. Среднее количество осадков за этот период
    d. Максимальное количество дневных осадков за этот период
    Не использовать массивы!
 */


import java.util.Scanner;
import com.amatsuka.contracts.RunnableExercise;


public class ex3_Statistics implements RunnableExercise {
    public void run() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите количество дней");

        int numberOfDays = sc.nextInt();

        int sumOfRainFall = 0;
        int maxRainFall = 0;

        for (int i = 0; i < numberOfDays; i++) {
            System.out.println("Введите количество осадков для дня №" + i);
            int input = sc.nextInt();

            sumOfRainFall += input;

            maxRainFall = maxRainFall < input ? input : maxRainFall;
        }

        System.out.println("Количество дней " + numberOfDays);
        System.out.println("Сумма осадков " + sumOfRainFall);
        System.out.println("Среднее количество осадков " + sumOfRainFall/numberOfDays);
        System.out.println("Максимальное количество осадков " + maxRainFall);


    }

    @Override
    public String description() {
        return "Статистика по осадкам за N дней";
    }
}
