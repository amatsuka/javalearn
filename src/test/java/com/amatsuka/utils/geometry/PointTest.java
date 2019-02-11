package com.amatsuka.utils.geometry;

import com.amatsuka.utils.geometry.Point;
import org.junit.Test;

import static org.junit.Assert.*;


public class PointTest {

    @Test
    public void distanceTest() {
        Point first = new Point(1, 1);
        Point second = new Point(1, 3);

        assertEquals(0, Double.compare(2.0, first.distance(second)));
    }
}
