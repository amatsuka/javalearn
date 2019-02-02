package com.amatsuka.utils.geometry.shapes.triangles;

import com.amatsuka.utils.geometry.Point;
import com.amatsuka.utils.geometry.Vector;
import com.amatsuka.utils.geometry.exceptions.InvalidVertexException;
import com.amatsuka.utils.geometry.shapes.Polygon;

public class Triangle extends Polygon {
    public Triangle(Point A, Point B, Point C) {
        setVertexes(A, B, C);
    }

    protected void setVertexes(Point A, Point B, Point C) {
        setVertex("A", A);
        setVertex("B", B);
        setVertex("C", C);
    }

    protected Point getVertexA() {
        return getVertex("A");
    }

    protected Point getVertexB() {
        return getVertex("B");
    }

    protected Point getVertexC() {
        return getVertex("C");
    }

    @Override
    public double area() {
        double halfPerimeter = perimeter() / 2;

        return Math.sqrt(halfPerimeter
                * (halfPerimeter - getVertexA().distance(getVertexB()))
                * (halfPerimeter - getVertexB().distance(getVertexC()))
                * (halfPerimeter - getVertexC().distance(getVertexA()))
        );
    }

    @Override
    public String toString() {
        return "Triangle:("
                + getVertexA() + ","
                + getVertexB() + ","
                + getVertexC()
                +")";
    }
}
