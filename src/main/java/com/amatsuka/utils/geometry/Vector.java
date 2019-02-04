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
        Point first = this.toPoint();
        Point second = vector.toPoint();

        return first.getX() * second.getX() + first.getY() * second.getY();
    }

    private Point toPoint() {
        return new Point(this.end.getX() - this.start.getX(), this.end.getY() - this.start.getY());
    }

    public double length() {
        return this.start.distance(this.end);
    }
}
