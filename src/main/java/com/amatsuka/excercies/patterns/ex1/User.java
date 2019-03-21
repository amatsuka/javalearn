package com.amatsuka.excercies.patterns.ex1;

import java.util.List;

public class User implements BaseEntity{
    private String name;
    private Integer age;
    private Animal pet;
    private List<User> relatives;

    @Override
    public void lie() {

    }

    @Override
    public void voice() {

    }

    public List<User> getRelatives() {
        return relatives;
    }

    public Animal getPet() {
        return pet;
    }
}
