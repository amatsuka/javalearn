package com.amatsuka.procedural.func;


import java.util.Scanner;
import com.amatsuka.contracts.RunnableExercise;


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

        int d = discriminant(a, b, c);

        if (!isPositive(d)) {
            System.out.println("Нет действительных корней");
        }

        if (isZero(d)) {
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

    private  int discriminant(final int a, final int b, final int c) {
        return b^2 - 4*a*c;
    }

    private boolean isPositive(int number) {
        return number > 0;
    }

    private boolean isZero(int number) {
        return number == 0;
    }

}
