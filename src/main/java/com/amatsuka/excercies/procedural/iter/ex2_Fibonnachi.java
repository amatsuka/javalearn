package com.amatsuka.excercies.procedural.iter;

import java.util.Scanner;
import com.amatsuka.contracts.RunnableExercise;


/*
    Написать программу, вычисляющую и отображающую все числа Фибоначчи меньше введённого пользователем целого числа.
    Решить двумя способами:
    с помощью цикла
    с помощью рекурсии.
 */
public class ex2_Fibonnachi implements RunnableExercise {
    public void run() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите число");

        long number = sc.nextLong();

        System.out.println("Методом циклов");
        iteration(number);

        System.out.println("Методом рекурсии");
        System.out.println(recursion(number));
    }

    @Override
    public String description() {
        return "Все числа Фибоначчи меньше введённого пользователем целого числа";
    }

    private long recursion(final long userNumber) {
        if (userNumber == 0) return 0;
        if (userNumber <= 2) return 1;

        return recursion(userNumber - 1) + recursion(userNumber - 2);
    }

    private void iteration(final long userNumber) {

        System.out.println(1);

        int prev = 1;
        int fib = 2;
        while ( fib < userNumber) {
            int a = fib;
            fib += prev;
            prev = a;

            System.out.println(fib);
        }
    }
}
