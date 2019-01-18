package com.amatsuka.procedural.iter;

import java.util.Scanner;
import com.amatsuka.contracts.RunnableExercise;


/*
    Написать программу, вычисляющую сумму цифр введённого пользователем целого числа.
 */
public class ex1_SumOfNumbers implements RunnableExercise {
    public void run() {
        Scanner sc = new Scanner(System.in);

        String number = sc.next();

        try {
            System.out.println(sum(number));
        } catch (NumberFormatException e) {
            System.out.println("Это не число");
        }
    }

    @Override
    public String description() {
        return "Написать программу, вычисляющую сумму цифр введённого пользователем целого числа";
    }

    private int sum(final String number) throws NumberFormatException {
        int result = 0;

        for (int i = 0; i < number.length(); i++) {
            result += Integer.parseInt(Character.toString(number.charAt(i)));
        }

        return result;
    }
}
