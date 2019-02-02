package com.amatsuka.utils.geometry.shapes;

import com.amatsuka.utils.geometry.shapes.quadrilaterals.Rectangle;
import com.amatsuka.utils.geometry.shapes.triangles.Triangle;

public abstract class ShapeUtils {
    public static boolean isRectangle(Shape shape) {
        return shape instanceof Rectangle;
    }

    public static boolean isTriangle(Shape shape) {
        return shape instanceof Triangle;
    }
}
