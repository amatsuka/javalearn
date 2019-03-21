package com.amatsuka.excercies.patterns.ex2;

import com.amatsuka.excercies.patterns.ex1.Animal;
import com.amatsuka.excercies.patterns.ex1.User;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class UserToAnimalsAdapter {
    private final User user;

    public UserToAnimalsAdapter(User user) {
        this.user = user;
    }

    public List<Animal> animals() {
        List<Animal> result = user.getRelatives().stream().map(User::getPet).filter(Objects::nonNull).collect(Collectors.toList());

        if (user.getPet() != null) {
            result.add(user.getPet());
        }

        return result;
    }
}
