package com.amatsuka.utils.pairs;

import com.amatsuka.excercies.generics.ex2_advancedpair.AdvancedPair;

import static java.util.Arrays.asList;

public final class PairUtils {
    private PairUtils() {}

    public static <T extends Comparable<T>> Iterable<T> maxPairs(AdvancedPair<T> ...args) {
        return new PairMaxIterable<>(asList(args));
    }
}
