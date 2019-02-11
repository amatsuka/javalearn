package com.amatsuka.utils.pairs;

import com.amatsuka.excercies.generics.ex2_advancedpair.AdvancedPair;

import java.util.Iterator;
import java.util.List;

public class PairMaxIterator<T extends Comparable<T>> implements Iterator<T> {

    private int cursor = 0;

    private final List<AdvancedPair<T>> list;

    public PairMaxIterator(List<AdvancedPair<T>> list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        return this.cursor < list.size();
    }

    @Override
    public T next() {
        return this.list.get(this.cursor++).max();
    }
}
