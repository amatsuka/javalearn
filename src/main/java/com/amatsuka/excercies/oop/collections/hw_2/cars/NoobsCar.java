package com.amatsuka.excercies.oop.collections.hw_2.cars;

public class NoobsCar extends Car {
    public NoobsCar(String model, String manufacturer, int productionYear, String color, long cost) {
        super(model, manufacturer, productionYear, color, cost);
    }

    @Override
    public String toString() {
        return "This machine makes nothing " + super.toString();
    }

    @Override
    public boolean equals(Object obj) {
         if (!(obj instanceof NoobsCar)) {
             return false;
         }

        return super.equals(obj);
    }
}
