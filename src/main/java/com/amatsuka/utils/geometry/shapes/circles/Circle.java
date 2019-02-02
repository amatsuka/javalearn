package com.amatsuka.utils.geometry.shapes.circles;

import com.amatsuka.utils.geometry.Point;
import com.amatsuka.utils.geometry.shapes.Shape;

public class Circle extends Point implements Shape {

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

    @Override
    public double perimeter() {
        return 2 * PI * radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
