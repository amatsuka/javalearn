package com.amatsuka.excercies.patterns.ex1;

import jdk.jfr.DataAmount;

public class Animal implements BaseEntity{
    private String nickname;
    private Type type;

    @Override
    public void lie() {

    }

    @Override
    public void voice() {

    }

    public enum Type{
        DOG, CAT, FISH, BIRD
    }
}
