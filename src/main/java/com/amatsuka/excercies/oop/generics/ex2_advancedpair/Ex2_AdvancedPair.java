package com.amatsuka.excercies.oop.generics.ex2_advancedpair;

import com.amatsuka.contracts.RunnableExercise;

/*
Видоизмените класс из предыдущего упражнения,
введя методы mах() и min() для получения наибольшего и наименьшего из двух элементов.
Наложите соответствующее ограничение на обобщенный тип Е.
 */
public class Ex2_AdvancedPair implements RunnableExercise {
    @Override
    public void run() {
        AdvancedPair<Integer> advancedPair = new AdvancedPair<>(1,2);

        System.out.println(advancedPair.min());
        System.out.println(advancedPair.max());
    }

    @Override
    public String description() {
        return "Видоизмененный Pair";
    }
}
