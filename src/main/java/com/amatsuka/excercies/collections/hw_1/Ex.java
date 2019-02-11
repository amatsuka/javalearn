package com.amatsuka.excercies.collections.hw_1;

import com.amatsuka.contracts.RunnableExercise;
import com.amatsuka.excercies.generics.ex2_advancedpair.AdvancedPair;
import com.amatsuka.utils.pairs.PairMaxIterable;
import com.amatsuka.utils.pairs.PairUtils;

import static java.util.Arrays.asList;

/*
Написать Iterable<Pair<Integer>> принимающий List<Pair<Integer>>
 который возвращает итератор max чисел из Pair из предыдущего задания
 (т.е. Iterator<Integer>) от этих Pair<Integer>. Наподобие такого.
for(Integer max : new PairMaxIterable(asList(Pair(1,2), Pair(3,2), Pair(1,5)))){
            System.out.print(max + " ");
}
должен вывести 1 3 5
 */

public class Ex implements RunnableExercise {
    @Override
    public void run() {


        Iterable<Integer> iterable = new PairMaxIterable<>(asList(new AdvancedPair(1,2), new AdvancedPair(3,2), new AdvancedPair(1,5)));

        for (Integer max : iterable) {
            System.out.println(max);
        }

        for (Object max : PairUtils.maxPairs(new AdvancedPair(1,2), new AdvancedPair(3,2), new AdvancedPair(1,5))) {
            System.out.println(max);
        }


    }

    @Override
    public String description() {
        return "Iterable<Pair<Integer>>";
    }
}
