package com.amatsuka.utils.geometry.shapes.quadrilaterals;

import com.amatsuka.utils.geometry.Point;
import com.amatsuka.utils.geometry.Vector;
import com.amatsuka.utils.geometry.exceptions.InvalidVertexException;
import com.amatsuka.utils.geometry.shapes.Polygon;

public abstract class Quadrilateral extends Polygon {

    public Quadrilateral(Point A, Point B, Point C, Point D) throws InvalidVertexException {
        super();
        setVertexes(A, B, C, D);
    }

    protected void setVertexes(Point A, Point B, Point C, Point D) {
        setVertex("A", A);
        setVertex("B", B);
        setVertex("C", C);
        setVertex("D", D);
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

    protected Point getVertexD() {
        return getVertex("D");
    }

    @Override
    public double perimeter() {
        return new Vector(getVertexA(), getVertexB()).length()
                + new Vector(getVertexB(), getVertexC()).length()
                + new Vector(getVertexC(), getVertexD()).length()
                + new Vector(getVertexD(), getVertexA()).length();
    }
}
