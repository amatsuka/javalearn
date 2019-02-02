package com.amatsuka.excercies.oop.inheritance;

import com.amatsuka.contracts.RunnableExercise;
import com.amatsuka.utils.geometry.Point;
import com.amatsuka.utils.geometry.shapes.circles.Circle;
import com.amatsuka.utils.geometry.shapes.quadrilaterals.Rectangle;
import com.amatsuka.utils.geometry.shapes.triangles.Triangle;

public class Ex implements RunnableExercise {
    @Override
    public void run() {
        Rectangle rectangle = new Rectangle(new Point(1,1), new Point(4, 6));

        Triangle triangle = new Triangle(new Point(1, 1), new Point(4, 6), new Point(0, 4));

        Circle circle = new Circle(1, 1, 6);

        System.out.println(rectangle);
        System.out.println(triangle);
        System.out.println(circle);

        System.out.println(rectangle.equalArea(triangle));
    }

    @Override
    public String description() {
        return null;
    }
}
