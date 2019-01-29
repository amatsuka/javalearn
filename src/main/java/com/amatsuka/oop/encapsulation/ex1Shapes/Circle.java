package com.amatsuka.oop.encapsulation.ex1Shapes;

import com.amatsuka.utils.Point;

public class Circle extends Point {

    private static double PI;
    static {
        PI = Math.PI;
    }

    private int radius;

    public Circle(int x, int y, int radius) {
        super(x, y);

        this.radius = radius;
    }

    public double area() {
        return PI * radius * radius;
    }
}
