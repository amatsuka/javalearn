package com.amatsuka.oop.encapsulation.ex1Shapes;

import com.amatsuka.utils.Point;
import com.amatsuka.utils.Vector;

public class Rectangle {

    private Point vertexA;

    private Point vertexB;

    private Point vertexC;

    private Point vertexD;

    public Rectangle(Point A, Point C) throws InvalidRectagleVertexException {
        this(A, new Point(A.getX(), C.getY()), C, new Point(C.getX(), A.getY()));
    }

    public Rectangle(Point A, Point B, Point C, Point D) throws InvalidRectagleVertexException {
        if (!isRectangleVertexes(A, B, C, D)) {
            throw new InvalidRectagleVertexException();
        }

        vertexA = A;
        vertexB = B;
        vertexC = C;
        vertexD = D;
    }

    private static boolean isRectangleVertexes(Point A, Point B, Point C, Point D) {

        Vector AB = new Vector(A, B);
        Vector BC = new Vector(B, C);
        Vector CD = new Vector(C, D);
        Vector DA = new Vector(D, A);

        return AB.isNormal(BC) && BC.isNormal(CD) && CD.isNormal(DA) && DA.isNormal(AB);
    }

    public double diagonalLength() {
        return vertexA.distance(vertexC);
    }

    public double area() {
        return vertexA.distance(vertexB) * vertexB.distance(vertexC);
    }
}
