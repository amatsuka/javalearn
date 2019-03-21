package com.amatsuka.excercies.patterns.ex3;

import com.amatsuka.excercies.patterns.ex1.Animal;

class AnimalTrainer implements Trainer{
    private Animal animal;

    AnimalTrainer(Animal animal) {
        this.animal = animal;
    }

    @Override
    public void lie() {
        animal.lie();
    }

    @Override
    public void voice() {
        animal.voice();
    }
}
