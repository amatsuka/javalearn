package com.amatsuka.utils.geometry;

public class Point {
    private int x;

    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return this.y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance(Point point) {
        return Math.sqrt(Math.pow(point.getX() - this.x, 2) + Math.pow(point.getY() - this.y, 2));
    }

    public Point translate(int distanceX, int distanceY) {
        return new Point(getX() + distanceX, getY() + distanceY);
    }

    public Point scale(int multipler) {
        return new Point(getX() * multipler, getY() * multipler);
    }

    @Override
    public String toString() {
        return "(" + this.x + "," + this.y + ')';
    }
}
