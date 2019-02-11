package com.amatsuka.utils.cars.garagecars;

public class MuscleCar extends Car {
    public MuscleCar(String model, String manufacturer, int productionYear, String color, long cost) {
        super(model, manufacturer, productionYear, color, cost);
    }

    @Override
    public String toString() {
        return "This machine makes vrum-vrum " + super.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof MuscleCar)) {
            return false;
        }

        return super.equals(obj);
    }
}
