package com.amatsuka.utils.geometry.shapes.quadrilaterals;

import com.amatsuka.utils.geometry.Point;
import com.amatsuka.utils.geometry.Vector;
import com.amatsuka.utils.geometry.exceptions.InvalidVertexException;
import com.amatsuka.utils.geometry.shapes.Polygon;
import com.amatsuka.utils.geometry.shapes.triangles.Triangle;

public class Quadrilateral extends Polygon {

    public Quadrilateral(Point A, Point B, Point C, Point D) {
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

    public double area() {
        Triangle triangleABC = new Triangle(getVertexA(), getVertexB(), getVertexC());
        Triangle triangleADC = new Triangle(getVertexA(), getVertexD(), getVertexC());
        return triangleABC.area() + triangleADC.area();
    }

    @Override
    public String toString() {
        return "Quadrilateral:("
                + getVertexA() + ","
                + getVertexB() + ","
                + getVertexC() + ","
                + getVertexD()
                +")";
    }
}
