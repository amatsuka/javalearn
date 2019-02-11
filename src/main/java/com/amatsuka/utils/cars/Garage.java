package com.amatsuka.utils.cars;

import com.amatsuka.utils.cars.garagecars.Car;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Garage {
    private Map<Car, Integer> cars;

    public Garage(List<Car> carsList) {
        this.cars = new HashMap<>();

        for (Car car : carsList) {
            this.parkCar(car);
        }
    }

    public void parkCar(Car car) {

        if (cars.containsKey(car)) {
            this.cars.compute(car, (k, v) -> v + 1);
        } else {
            this.cars.put(car, 1);
        }
    }

    public boolean takeCar(Car car) {
        if (!this.cars.containsKey(car)) {
            return false;
        }

        Integer count = this.cars.get(car);

        if (count > 0) {
            this.cars.compute(car, (k, v) -> v - 1);

            return true;
        }

        return false;
    }

    public int countOf(Car car) {
        return this.cars.get(car);
    }
}
