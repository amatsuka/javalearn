package com.amatsuka.excercies.patterns.ex1;

public class Ex {
    public static void main(String[] args) {
        Factory factory = new Factory();

        User user = factory.makeUser();
        Animal animal = factory.makeAnimal();
    }
}
