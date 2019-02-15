package com.amatsuka.excercies.exceptions;

import com.amatsuka.contracts.RunnableExercise;
import com.amatsuka.utils.Input;
import com.amatsuka.utils.exceptions.NumberArrayFormatException;

import java.util.List;

/*
 * Напишите метод public List<Double> readValues() throws ..., читающий числа с плавающей точкой из ввода консоли, через Scanner.
 * Сгенерируйте подходящие исключения, если ввод если введены данные, не относящиеся к числам с плавающей точкой.
 * Ввод: 1 2 3 4 aaaa
 */
public class Ex1_ReadValues implements RunnableExercise {
    @Override
    public void run() {
        /**
         * @TODO Как передать тип красиво
         */
        List<Double> input;

        try {
            input = Input.readNumberArray(Double.class, System.in);
            System.out.println(input);
        } catch (NumberArrayFormatException e) {
            System.out.println(e);
        }

    }

    @Override
    public String description() {
        return "Чтение чисел с плавающей точкой из ввода консоли";
    }
}
