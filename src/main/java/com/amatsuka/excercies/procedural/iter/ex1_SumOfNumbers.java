package com.amatsuka.excercies.procedural.iter;

import java.util.Scanner;
import com.amatsuka.contracts.RunnableExercise;
import com.amatsuka.utils.Input;
import com.amatsuka.utils.Strings;


/*
    Написать программу, вычисляющую сумму цифр введённого пользователем целого числа.
 */
public class ex1_SumOfNumbers implements RunnableExercise {
    public void run() {

        String number = Input.readString(System.in);

        try {
            System.out.println(Strings.sumOfStringNumber(number));
        } catch (NumberFormatException e) {
            System.out.println("Это не число");
        }
    }

    @Override
    public String description() {
        return "Написать программу, вычисляющую сумму цифр введённого пользователем целого числа";
    }
}
