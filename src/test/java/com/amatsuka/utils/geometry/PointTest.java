package com.amatsuka.utils.geometry;

import com.amatsuka.utils.geometry.Point;
import org.junit.Test;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;


public class PointTest {

    @Test
    public void distanceTest() {
        Point first = new Point(1, 1);
        Point second = new Point(1, 3);

        assertEquals(0, Double.compare(2.0, first.distance(second)));
    }

    @Test
    public void translateTest() {
        Point point = new Point(1, 1);
        Point translatedPoint = point.translate(1,2);

        assertThat(translatedPoint.getX(), is(2));
        assertThat(translatedPoint.getY(), is(3));
    }


    @Test
    public void scaleTest() {
        Point point = new Point(1, 3);
        Point scaledPoint = point.scale(2);

        assertThat(scaledPoint.getX(), is(2));
        assertThat(scaledPoint.getY(), is(6));
    }

    @Test
    public void toStringTest() {
        Point point = new Point(1, 3);
        assertThat(point.toString(), is("(1,3)"));
    }
}
