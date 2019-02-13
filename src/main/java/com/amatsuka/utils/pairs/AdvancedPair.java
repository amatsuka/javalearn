package com.amatsuka.utils.pairs;

import com.amatsuka.utils.pairs.Pair;

public class AdvancedPair<E extends Comparable<E>> extends Pair<E> {
    public AdvancedPair(E first, E second) {
        super(first, second);
    }

    public E min() {
        return getFirst().compareTo(getSecond()) > 0 ? getSecond() : getFirst();
    }

    public E max() {
        return getFirst().compareTo(getSecond()) <= 0 ? getSecond() : getFirst();
    }
}
