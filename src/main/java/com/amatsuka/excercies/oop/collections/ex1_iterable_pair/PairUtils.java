package com.amatsuka.excercies.oop.collections.ex1_iterable_pair;

import com.amatsuka.excercies.oop.generics.ex2_advancedpair.AdvancedPair;

import static java.util.Arrays.asList;

public final class PairUtils {
    private PairUtils() {}

    static <T extends Comparable<T>> Iterable<T> maxPairs(AdvancedPair<T> ...args) {
        return new PairMaxIterable<>(asList(args));
    }
}
