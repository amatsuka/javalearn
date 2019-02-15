package com.amatsuka.excercies.exceptions;

import com.amatsuka.contracts.RunnableExercise;
import com.amatsuka.utils.Arrays;
import com.amatsuka.utils.Input;
import com.amatsuka.utils.exceptions.NumberArrayFormatException;
import com.amatsuka.utils.exceptions.ParseStrategyNotFoundException;

import java.util.List;

/**
 * Напишите метод public double sumOfValues() throws ...,
 * вызывающий метод из предыдущего упражнения и возвращающий сумму введеных значений в разных строках.
 * Организуйте распространение любых исключений вызывающему коду. Ввод:
 * 1 2 3 4
 * 2 3 4 aaa
 */
public class Ex2_SumOfValues implements RunnableExercise {
    @Override
    public void run() {
        try {
            System.out.println(sumOfReadedValues());
        } catch (MotherOfAllException e) {
            System.out.println("Тикай из города бо");
            System.out.println(e);
        }
    }

    @Override
    public String description() {
        return "метод public double sumOfValues()";
    }

    private static double sumOfReadedValues() throws MotherOfAllException {
        List<Double> list;

        try {
            list = Input.readNumberArray(1D, System.in);
        } catch (Throwable e) {
            throw new MotherOfAllException(e);
        }

        return list.stream().reduce(0D, (Double a, Double b) -> a + b);
    }
}
