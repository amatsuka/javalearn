package com.amatsuka.utils.geometry.shapes;

public interface Shape {
    double area();
    double perimeter();

    default boolean equal(Shape shape) {
        return Double.compare(this.area(), shape.area()) == 0;
    }
}
