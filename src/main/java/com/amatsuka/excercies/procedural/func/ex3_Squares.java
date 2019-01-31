package com.amatsuka.excercies.procedural.func;


import com.amatsuka.contracts.RunnableExercise;
import com.amatsuka.utils.Arithmetic;

import java.util.Scanner;


/*
    Написать программу, вычисляющую корни квадратного уравнения вида ax² + bx + c = 0,
    где a, b и c - вводимые пользователем из консоли данные.
    Учитывать только реальные корни (в случае отрицательного дискриминанта выводить сообщение пользователю).
    При решении создать и использовать следующие вынесенные функции:
    функция isPositive, определяющая, является ли число положительным
    функция isZero, определяющая, является ли число нулём
    функция discriminant, вычисляющая дискриминант
 */
public class ex3_Squares implements RunnableExercise {
    public void run() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите a b и c");

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int d = Arithmetic.discriminant(a, b, c);

        if (!Arithmetic.isPositive(d)) {
            System.out.println("Нет действительных корней");
        }

        if (Arithmetic.isZero(d)) {
            System.out.print("Уравнение имеет один корень " + ((-b)/(2*a)));
            System.out.println((-b)/(2*a));
        } else {
            System.out.print("Уравнение имеет два корня ");
            System.out.print((-b + Math.sqrt(d))/(2*a));
            System.out.print(' ');
            System.out.println((-b - Math.sqrt(d))/(2*a));
        }


    }

    @Override
    public String description() {
        return "Написать программу, вычисляющую корни квадратного уравнения";
    }
}
