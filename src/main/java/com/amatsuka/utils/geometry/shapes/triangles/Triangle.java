package com.amatsuka.utils.geometry.shapes.triangles;

import com.amatsuka.utils.geometry.Point;
import com.amatsuka.utils.geometry.Vector;
import com.amatsuka.utils.geometry.exceptions.InvalidVertexException;
import com.amatsuka.utils.geometry.shapes.Polygon;

public class Triangle extends Polygon {
    public Triangle(Point A, Point B, Point C) throws InvalidVertexException {
        super();
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
    protected boolean isValidVertexes() {
        return false;
    }

    @Override
    public double area() {
        //@TODO implement
    }

    @Override
    public double perimeter() {
        return new Vector(getVertexA(), getVertexB()).length()
                + new Vector(getVertexB(), getVertexC()).length()
                + new Vector(getVertexC(), getVertexA()).length();
    }
}
