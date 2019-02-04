package com.amatsuka.utils;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArithmeticTest {

    @Test
    public void isPositiveTest() {
        assertTrue(Arithmetic.isPositive(1));

        assertFalse(Arithmetic.isPositive(0));

        assertFalse(Arithmetic.isPositive(-1));
    }

    @Test
    public void discriminantTest() {
        assertEquals(-8, Arithmetic.discriminant(1,2,3));
        assertEquals(36, Arithmetic.discriminant(1,-8,7));
    }

    @Test
    public void isZeroTest() {
        assertTrue(Arithmetic.isZero(0));
        assertFalse(Arithmetic.isZero(1));
        assertFalse(Arithmetic.isZero(-1));
    }
}
