package com.amatsuka.utils;

import org.junit.Test;
import static org.junit.Assert.*;

public class VectorTest {
    @Test
    public void isNormalTest() {
        Vector first = new Vector(new Point(0,0), new Point(0,4));
        Vector second = new Vector(new Point(0, 4), new Point(6, 4));

        Vector third = new Vector(new Point(0, 4), new Point(6, 0));


        assertTrue(first.isNormal(second));
        assertFalse(first.isNormal(third));
    }
}
