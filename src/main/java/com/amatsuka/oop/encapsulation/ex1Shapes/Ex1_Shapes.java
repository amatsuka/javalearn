package com.amatsuka.oop.encapsulation.ex1Shapes;

import com.amatsuka.contracts.RunnableExercise;
import com.amatsuka.utils.Point;

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

            System.out.println("Длина диагонали: " + rectangle.diagonalLength());
            System.out.println("Площадь: " + rectangle.area());
        } catch (InvalidRectagleVertexException e) {
            e.printStackTrace();
        }


    }

    @Override
    public String description() {
        return "Прямоугольник и окружность";
    }
}
