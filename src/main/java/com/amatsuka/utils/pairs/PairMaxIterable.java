package com.amatsuka.utils.pairs;

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
