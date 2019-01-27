package com.amatsuka.oop.classes.Ex1Point;

import com.amatsuka.contracts.RunnableExercise;
import com.amatsuka.utils.Arrays;
import com.amatsuka.utils.Input;

import java.io.InputStream;

/*
Создать класс Point, описывающий точку в двумерных координатах.
Полями этого класса должны быть координаты x и y. Класс должен иметь один конструктор, принимающий координаты x и y.
Сделайте информацию о координатах скрытой, а получить её можно только с помощью методов доступа (get/set).
Создать метод distance, принимающий объект Point и определяющий расстояние до неё.

**(Дополнительно) Сделайте этот класс неизменяемым. Предоставьте методы translate() и scale().
В частности, метод translate() должен перемещать точку на определенное расстояние в направлении координат х и у ,
 а метод scale() — изменять масштаб по обеим координатам на заданный коэффициент.
 Реализуйте эти методы таким образом, чтобы они возвращали новые точки в качестве результата.
Например, в следующей строке кода:

    Point р = new Point(3, 4).translate(1, 3).scale(2);

в переменной р должна быть установлена точка с координатами Point(8, 14), т.е. new Point(3, 4).translate(1, 3) == new Point(4, 7), а new Point(4, 7).scale(2) == Point(8, 14).\
 */

public class ex1_Point implements RunnableExercise {
    @Override
    public void run() {
        InputStream inputStream = System.in;

        int[] firstCoordinates = Arrays.readIntegerArray(inputStream,"Введите координаты первой точки");

        Point point = new Point(firstCoordinates[0], firstCoordinates[1]);
        System.out.println(point);

        int[] secondCoordinates = Arrays.readIntegerArray(inputStream,"Введите координаты второй точки");

        Point secondPoint = new Point(secondCoordinates[0],secondCoordinates[1]);

        System.out.println("Расстояние: " + point.distance(secondPoint));

        Point p = point;


        int[] shift = Arrays.readIntegerArray(inputStream,"Введите смещение");
        System.out.println(p = p.translate(shift[0], shift[1]));

        int multiple = Input.readInt(inputStream, "Введите множитель");

        System.out.println(p = p.scale(multiple));
    }

    @Override
    public String description() {
        return "Создать класс Point, описывающий точку в двумерных координатах";
    }
}
