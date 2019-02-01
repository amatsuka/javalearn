package com.amatsuka.utils.geometry.shapes.quadrilaterals;

import com.amatsuka.utils.geometry.Point;
import com.amatsuka.utils.geometry.exceptions.InvalidVertexException;

public class Square extends Rectangle {
    public Square(Point A, Point C) throws InvalidVertexException {
        super(A, C);
    }

    public Square(Point A, Point B, Point C, Point D) throws InvalidVertexException {
        super(A, B, C, D);
    }
}
