package com.amatsuka.excercies.oop.classes;

import com.amatsuka.contracts.RunnableExercise;
import com.amatsuka.utils.Input;
import com.amatsuka.utils.car.exceptions.Car;
import com.amatsuka.utils.car.NotEnoughFuelException;

import java.io.InputStream;

public class Ex2_Car implements RunnableExercise {
    @Override
    public void run() {
        InputStream inputStream = System.in;

        int fuelConsumption = Input.readInt(inputStream, "Введите разсход топлива в Л/100км");

        int fuelLevel = Input.readInt(inputStream, "Введите уровень топлива в баке");

        Car car = new Car(fuelLevel, fuelConsumption);
        System.out.println(car);

        while (true) {
            int distance = Input.readInt(inputStream, "Сколько км проехать? Введите 0 для завершения поездки.");

            if (distance <= 0) {
                break;
            }

            try {
                car.move(distance);
                System.out.println(car);
            } catch (NotEnoughFuelException e) {
                System.out.println("Недостаточно топлива для поездки :(");
                System.out.println("На оставшемся топливе вы можете проехать " + car.maximumDistance() + " км");
            }
        }

        System.out.println("Поездка закончилась");
        System.out.println(car);
    }

    @Override
    public String description() {
        return "Моделирование передвижения автомобиля";
    }
}
