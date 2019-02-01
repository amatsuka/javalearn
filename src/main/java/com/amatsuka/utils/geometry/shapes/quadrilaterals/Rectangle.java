package com.amatsuka.utils.geometry.shapes.quadrilaterals;

import com.amatsuka.utils.geometry.Point;
import com.amatsuka.utils.geometry.Vector;
import com.amatsuka.utils.geometry.exceptions.InvalidVertexException;

public class Rectangle extends Quadrilateral {

    public Rectangle(Point A, Point C) throws InvalidVertexException {
        this(A, new Point(A.getX(), C.getY()), C, new Point(C.getX(), A.getY()));
    }

    public Rectangle(Point A, Point B, Point C, Point D) throws InvalidVertexException {
        super(A,B,C,D);
    }

    @Override
    public double area() {
        return new Vector(getVertexA(), getVertexB()).length() * new Vector(getVertexB(), getVertexC()).length();
    }

    protected boolean isValidVertexes() {

        Vector AB = new Vector(getVertexA(), getVertexB());
        Vector BC = new Vector(getVertexB(), getVertexC());
        Vector CD = new Vector(getVertexC(), getVertexD());
        Vector DA = new Vector(getVertexD(), getVertexA());

        return !AB.isNormal(BC) || !BC.isNormal(CD) || !CD.isNormal(DA) || !DA.isNormal(AB);
    }
}
