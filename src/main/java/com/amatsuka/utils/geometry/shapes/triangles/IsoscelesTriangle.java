package com.amatsuka.utils.geometry.shapes.triangles;

import com.amatsuka.utils.geometry.Point;
import com.amatsuka.utils.geometry.exceptions.InvalidVertexException;

public class IsoscelesTriangle extends Triangle {
    public IsoscelesTriangle(Point A, Point B, Point C) throws InvalidVertexException {
        super(A, B, C);
    }
}
