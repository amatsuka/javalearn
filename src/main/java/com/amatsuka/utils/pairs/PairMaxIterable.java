package com.amatsuka.utils.pairs;

import com.amatsuka.excercies.generics.ex2_advancedpair.AdvancedPair;

import java.util.Iterator;
import java.util.List;

public class PairMaxIterable<T extends Comparable<T>> implements Iterable<T> {

    private final List<AdvancedPair<T>> list;

    public PairMaxIterable(List<AdvancedPair<T>> list) {
        this.list = list;
    }

    @Override
    public Iterator<T> iterator() {
        return new PairMaxIterator<T>(list);
    }
}
