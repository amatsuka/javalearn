package com.amatsuka.utils.geometry.shapes.quadrilaterals;

import com.amatsuka.utils.geometry.Point;
import com.amatsuka.utils.geometry.exceptions.InvalidVertexException;

public class Rhombus extends Quadrilateral {
    public Rhombus(Point A, Point B, Point C, Point D) {
        super(A, B, C, D);
    }

    @Override
    public String toString() {
        return "Rhombus:" + super.toString();
    }
}
