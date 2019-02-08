package com.amatsuka.excercies.oop.collections.hw_2.cars;

public class LowriderCar extends Car {
    public LowriderCar(String model, String manufacturer, int productionYear, String color, long cost) {
        super(model, manufacturer, productionYear, color, cost);
    }

    @Override
    public String toString() {
        return "This machine makes jump-jump " + super.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof LowriderCar)) {
            return false;
        }

        return super.equals(obj);
    }
}
