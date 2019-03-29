package com.amatsuka.excercies.patterns.ex2;

import com.amatsuka.excercies.patterns.ex1.Animal;
import com.amatsuka.excercies.patterns.ex1.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class UserToAnimalsAdapter {
    private final User user;

    public UserToAnimalsAdapter(User user) {
        this.user = user;
    }

    public List<Animal> animals() {
        return getAnimals(user);
    }

    private List<Animal> getAnimals(User user) {
        List<Animal> animals = new ArrayList<>();

        if (user.getPet() != null) {
            animals.add(user.getPet());
        }

        if (user.getRelatives() != null) {
            user.getRelatives().stream()
                    .filter(Objects::nonNull)
                    .flatMap(relative -> getAnimals(relative).stream())
                    .filter(Objects::nonNull)
                    .forEach(animals::add);

        }

        return animals;
    }
}
