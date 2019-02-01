package com.amatsuka.excercies.oop.encapsulation;

import com.amatsuka.contracts.RunnableExercise;
import com.amatsuka.utils.geometry.Point;
import com.amatsuka.utils.geometry.exceptions.InvalidVertexException;
import com.amatsuka.utils.geometry.shapes.circles.Circle;
import com.amatsuka.utils.geometry.shapes.quadrilaterals.Rectangle;

/*
Продолжение задачи 1. Используя класс точки, создать класс Rectangle, описывающий прямоугольник, и класс Circle описывающий круг.
 В них должны храниться поля типа Point в роли координат.
Создать следующие методы в классе Rectangle:
- Высчитывающий длину диагонали
Методы в классе Circle:
- Высчитывающий длину окружности. У обоих классов должен быть метод нахождения площади.
Написать программу, тестовый класс с методом main, демонстрирующим создание объекта класса Rectangle и применение вышеперечисленных методов.
 */
public class Ex1_Shapes implements RunnableExercise {
    @Override
    public void run() {
        try {
            Rectangle rectangle = new Rectangle(new Point(0, 0), new Point(0, 4), new Point(6, 4), new Point(6, 0));
            Rectangle rectangle2 = new Rectangle(new Point(0, 0), new Point(6, 4));

            System.out.println("Длина диагонали прямоугольника 1: " + rectangle.diagonalLength());
            System.out.println("Площадь прямоугольника 1: " + rectangle.area());

            System.out.println("Длина диагонали прямоугольника 2: " + rectangle2.diagonalLength());
            System.out.println("Площадь прямоугольника 2: " + rectangle2.area());
        } catch (InvalidVertexException e) {
            e.printStackTrace();
        }

        Circle circle = new Circle(0, 0, 10);

        System.out.println("Площадь окружности: " + circle.area());



    }

    @Override
    public String description() {
        return "Прямоугольник и окружность";
    }
}
