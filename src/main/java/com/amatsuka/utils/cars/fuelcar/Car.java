package com.amatsuka.utils.cars.fuelcar;

import com.amatsuka.utils.cars.fuelcar.exceptions.NotEnoughFuelException;

public class Car {
    private double fuelLevel;

    private int fuelConsumption;

    private int tripDistance = 0;

    public Car(int fuelLevel, int fuelConsumption) {
        this.fuelLevel = fuelLevel;
        this.fuelConsumption = fuelConsumption;
    }

    public Car move(int distance) throws NotEnoughFuelException {
        double requiredFuel = fuelConsumption/100.0 * distance;

        if ((fuelLevel - requiredFuel) < 0) {
            throw new NotEnoughFuelException();
        }

        tripDistance += distance;
        fuelLevel -= requiredFuel;

        return this;
    }

    public int maximumDistance() {
        return (int)Math.floor(fuelLevel / (fuelConsumption/100.0));
    }

    @Override
    public String toString() {
        return "Car{" +
                "fuelLevel=" + fuelLevel +
                ", fuelConsumption=" + fuelConsumption +
                ", tripDistance=" + tripDistance +
                ", maximumDistance=" + maximumDistance() +
                '}';
    }
}
