package com.amatsuka.utils.geometry.shapes.quadrilaterals;

import com.amatsuka.utils.geometry.Point;
import com.amatsuka.utils.geometry.Vector;
import com.amatsuka.utils.geometry.shapes.RectangleShape;

public class Rectangle extends Quadrilateral implements RectangleShape {

    public Rectangle(Point A, Point C) {
        this(A, new Point(A.getX(), C.getY()), C, new Point(C.getX(), A.getY()));
    }

    public Rectangle(Point A, Point B, Point C, Point D) {
        super(A,B,C,D);
    }

    @Override
    public String toString() {
        return "Rectangle:" + super.toString();
    }

    public double diagonalLength() {
        return getVertexA().distance(getVertexC());
    }
}
