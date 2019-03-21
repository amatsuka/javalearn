package com.amatsuka.excercies.patterns.ex1;

public class Factory {
    User makeUser() {
        return new User();
    }

    Animal makeAnimal() {
        return new Animal();
    }
}
