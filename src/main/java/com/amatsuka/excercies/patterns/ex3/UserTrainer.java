package com.amatsuka.excercies.patterns.ex3;

import com.amatsuka.excercies.patterns.ex1.User;

class UserTrainer implements Trainer{
    private User user;

    UserTrainer(User user) {
        this.user = user;
    }


    @Override
    public void lie() {
        user.lie();
    }

    @Override
    public void voice() {
        user.voice();
    }
}
