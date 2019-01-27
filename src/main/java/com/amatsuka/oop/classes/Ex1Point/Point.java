package com.amatsuka.oop.classes.Ex1Point;

public class Point {
    private int x;

    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int distance(Point point) {
        /**
         * @TODO почему так можно обращаться к закрытым членам дугого объекта?
         * System.out.println(point.x);
         * System.out.println(point.y);
         */

        int selfX = getX();
        int selfY = getY();

        int otherX = point.getX();
        int otherY = point.getY();

        return (int)Math.sqrt(Math.pow(otherX - selfX, 2) + Math.pow(otherY - selfY, 2));
    }

    public Point translate(int distanceX, int distanceY) {
        return new Point(getX() + distanceX, getY() + distanceY);
    }

    public Point scale(int multipler) {
        return new Point(getX() * multipler, getY() * multipler);
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
