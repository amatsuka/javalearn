package com.amatsuka.utils.geometry;

public class Vector {
    private Point start;

    private Point end;

    public Vector(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    public boolean isNormal(Vector compared) {
        return this.scalarMultiple(compared) / (this.length() * compared.length()) == 0;
    }

    private int scalarMultiple(Vector vector) {
        Point first = this.toOnePoint();
        Point second = vector.toOnePoint();

        return first.getX() * second.getX() + first.getY() * second.getY();
    }

    private Point toOnePoint() {
        return new Point(end.getX() - start.getX(), end.getY() - start.getY());
    }

    public double length() {
        return start.distance(end);
    }
}
