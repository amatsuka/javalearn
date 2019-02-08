package com.amatsuka.excercies.oop.collections.hw_2.cars;

import org.apache.commons.codec.digest.DigestUtils;

public abstract class Car {
    private String model;

    private String manufacturer;

    private int productionYear;

    private String color;

    private long cost;

    protected Car(String model, String manufacturer, int productionYear, String color, long cost) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.productionYear = productionYear;
        this.color = color;
        this.cost = cost;
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getColor() {
        return color;
    }

    public long getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return "{" +
                "model='" + model + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", productionYear=" + productionYear +
                ", color='" + color + '\'' +
                ", cost=" + cost +
                '}';
    }

    @Override
    public int hashCode() {
        String string = this.toString();
        int result = 0;

        for (int i = 0; i < string.length(); i++) {
            result += string.charAt(i) * i;
        }

        return result;
    }

    @Override
    public boolean equals(Object obj) {

        Car car = (Car)obj;

        if (!car.getColor().equals(this.getColor())) {
            return false;
        }

        if (!car.getManufacturer().equals(this.getManufacturer())) {
            return false;
        }

        if (!car.getModel().equals(this.getModel())) {
            return false;
        }

        if (car.getProductionYear() != this.getProductionYear()) {
            return false;
        }

        return super.equals(obj);
    }
}
