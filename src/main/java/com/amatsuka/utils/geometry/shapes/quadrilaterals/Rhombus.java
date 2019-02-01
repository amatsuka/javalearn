package com.amatsuka.utils.geometry.shapes.quadrilaterals;

import com.amatsuka.utils.geometry.Point;
import com.amatsuka.utils.geometry.exceptions.InvalidVertexException;

public class Rhombus extends Quadrilateral {
    public Rhombus(Point A, Point B, Point C, Point D) throws InvalidVertexException {
        super(A, B, C, D);
    }

    @Override
    protected boolean isValidVertexes() {
        //@TODO implement

    }

    @Override
    public double area() {
        //@TODO implement
    }
}
