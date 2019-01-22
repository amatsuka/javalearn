package com.amatsuka.procedural.strings;

import com.amatsuka.contracts.RunnableExercise;

import java.util.Scanner;

/*
Проверить, является ли введённая строка палиндромом, т.е. читается одинаково в обоих направлениях
 */
public class ex1_Palindrome implements RunnableExercise {
    @Override
    public void run() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите строку");

        String input = sc.nextLine();

        System.out.println(isPalindrome(input) ? "Это полиндром" : "Это не полиндром");
    }

    private boolean isPalindrome(String input) {

        int inputLastIndex = input.length() - 1;
        int lastSignificantCharIndex = (int)Math.ceil(input.length()/2);

        for (int i = 0; i < lastSignificantCharIndex; i++) {
            if (input.charAt(i) != input.charAt(inputLastIndex - i)) {
                return false;
            }
        }

        return true;
    }

    @Override
    public String description() {
        return "Проверить, является ли введённая строка палиндромом";
    }
}
