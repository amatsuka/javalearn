package com.amatsuka.utils.geometry.shapes.triangles;

import com.amatsuka.utils.geometry.Point;
import com.amatsuka.utils.geometry.exceptions.InvalidVertexException;

public class IsoscelesTriangle extends Triangle {
    public IsoscelesTriangle(Point A, Point B, Point C) {
        super(A, B, C);
    }

    @Override
    public String toString() {
        return "Quadrilateral:("
                + getVertexA() + ","
                + getVertexB() + ","
                + getVertexC()
                +")";
    }
}
