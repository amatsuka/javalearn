package com.amatsuka.utils.geometry.shapes.quadrilaterals;

import com.amatsuka.utils.geometry.Point;
import com.amatsuka.utils.geometry.exceptions.InvalidVertexException;
import com.amatsuka.utils.geometry.shapes.Shape;

public class Parallelogram extends Quadrilateral {

    public Parallelogram(Point A, Point B, Point C, Point D) {
        super(A, B, C, D);
    }

    @Override
    public String toString() {
        return "Parallelogram:" + super.toString();
    }
}
