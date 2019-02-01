package com.amatsuka.utils.geometry.shapes.triangles;

import com.amatsuka.utils.geometry.Point;
import com.amatsuka.utils.geometry.exceptions.InvalidVertexException;

public class EquilateralTriangle extends Triangle {
    public EquilateralTriangle(Point A, Point B, Point C) throws InvalidVertexException {
        super(A, B, C);
    }
}
