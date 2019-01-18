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

public class ex3_Statistics {
    public void run() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите количество дней");

        int numberOfDays = sc.nextInt();


        for (int i = 0; i < numberOfDays; i++) {
            System.out.println("Введите количество осадков для дня №" + i);
            /**
             * @TODO
             */
        }


    }
}
