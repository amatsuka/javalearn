package com.amatsuka.excercies.generics.ex1_pair;

public class Pair<E> {
    private E first;

    private E second;

    public Pair(E first, E second) {
        this.first = first;
        this.second = second;
    }

    public E getFirst() {
        return this.first;
    }

    public E getSecond() {
        return this.second;
    }
}
