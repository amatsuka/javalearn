package com.amatsuka.utils.geometry.shapes.quadrilaterals;

import com.amatsuka.utils.geometry.Point;
import com.amatsuka.utils.geometry.exceptions.InvalidVertexException;

public class Square extends Rectangle {
    public Square(Point A, Point C) {
        super(A, C);
    }

    public Square(Point A, Point B, Point C, Point D) {
        super(A, B, C, D);
    }

    @Override
    public String toString() {
        return "Square:" + super.toString();
    }
}
