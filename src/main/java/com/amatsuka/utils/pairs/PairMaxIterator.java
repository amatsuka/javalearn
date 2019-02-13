package com.amatsuka.utils.pairs;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

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
        if(this.cursor >= list.size()) {
            throw new NoSuchElementException();
        }

        return this.list.get(this.cursor++).max();
    }
}
