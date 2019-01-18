package com.amatsuka.procedural.iter;

import java.util.Scanner;

/*
    Написать программу, вычисляющую и отображающую все числа Фибоначчи меньше введённого пользователем целого числа.
    Решить двумя способами:
    с помощью цикла
    с помощью рекурсии.
 */
public class ex2_Fibonnachi {
    public void run() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите число");

        long number = sc.nextLong();

        System.out.println("Методом циклов");
        System.out.println(iteration(number));

        System.out.println("Методом рекурсии");
        System.out.println(recursion(number));
    }

    private long recursion(final long userNumber) {
        if (userNumber == 0) return 0;
        if (userNumber <= 2) return 1;

        return recursion(userNumber - 1) + recursion(userNumber - 2);
    }

    private int iteration(final long userNumber) {
        if (userNumber == 0) return 0;
        if (userNumber <= 2) return 1;

        int prev = 1;
        int fib;

        for (fib = 2; fib < userNumber; fib += prev) {
            prev = fib;
        }

        return fib;
    }
}
