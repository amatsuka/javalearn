package com.amatsuka.excercies.collections.hw_2;

import com.amatsuka.contracts.RunnableExercise;
import com.amatsuka.utils.cars.*;
import com.amatsuka.utils.cars.garagecars.Car;
import com.amatsuka.utils.cars.garagecars.LowriderCar;
import com.amatsuka.utils.cars.garagecars.MuscleCar;
import com.amatsuka.utils.cars.garagecars.NoobsCar;

import static java.util.Arrays.asList;

/*
Создать абстрактный класс Car, представляющий собой автомобиль.
Добавить в него поля: марка, модель, год выпуска + несколько своих. Создать 4 класса, являющихся наследниками Car.
 Переопределить во всех 3-х классах методы equals(), hashCode() и toString()
 Создать класс Garage, хранящий в себе HashMap автомобилей, в котором ключом является объект автомобиля,
 значением - количество точно таких автомобилей в гараже.
Добавить в класс Garage методы для парковки, выезда авто, а также для получения количества определенного вида автомобилей.
Продемонстрировать работу гаража.
 */
public class Ex2_Car implements RunnableExercise {
    @Override
    public void run() {

        Car muscle = new MuscleCar("challenger", "Dodge", 1968, "black", 100000);
        Car muscle2 = new MuscleCar("challenger", "Dodge", 1968, "black", 150000);

        Car lada = new NoobsCar("kalina sport", "Lada", 2018, "red", 1000);

        Car lowrider = new LowriderCar("Priora", "Lada", 2017, "pink", 9999999);

        Garage garage = new Garage(asList(muscle, lada));

        System.out.println("Количесво " + muscle + ":" + garage.countOf(muscle));

        System.out.println("Результат получения отсутствующей машины:" + garage.takeCar(lowrider));

        garage.parkCar(lowrider);
        garage.parkCar(muscle);
        garage.parkCar(muscle2);

        System.out.println(muscle + ":" + garage.countOf(muscle));
        System.out.println(muscle2 + ":" +garage.countOf(muscle2));
        System.out.println(lowrider + ":" + garage.countOf(lowrider));
        System.out.println(lada + ":" +garage.countOf(lada));




    }

    @Override
    public String description() {
        return null;
    }
}
