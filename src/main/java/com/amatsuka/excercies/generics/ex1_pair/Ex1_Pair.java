package com.amatsuka.excercies.generics.ex1_pair;

import com.amatsuka.contracts.RunnableExercise;
import com.amatsuka.utils.pairs.Pair;

/*
Реализуйте обобщенный класс Pair, позволяющий сохранять пару элементов типа Е.
Предоставьте методы доступа для получения первого и второго элементов.
 */
public class Ex1_Pair implements RunnableExercise {
    @Override
    public void run() {
        Pair<Integer> pair = new Pair<>(1,2);

        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());
    }

    @Override
    public String description() {
        return "обобщенный класс Pair";
    }
}
