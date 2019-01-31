package com.amatsuka.utils;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.Assert.*;

public class ArraysTest {
    @Test
    public void joinTest() {
        String separator = "/";
        int[] array = {1,2,3,4,5};
        String expected = "1/2/3/4/5";

        assertEquals("Unexpected string value", expected, Arrays.join(separator, array));
    }

    @Test
    public void mergeTest() {
        int[] firstArray = {1,2,3};
        int[] secondArray = {4,5,6};

        int[] expected = {1,4,2,5,3,6};

        assertArrayEquals("Unexpected array", expected, Arrays.merge(firstArray, secondArray));
    }

    @Test
    public void shiftRightTest() {
        int[] array = {1, 2, 3, 4, 5};

        int[] expected = {5,1,2,3,4};

        assertArrayEquals("Unexpected array", expected, Arrays.shiftRight(array));
    }

    @Test
    public void uniqueTest() {
        int[] array = {1, 2, 5, 3, 4, 5};

        int[] expected = {1,2,5,3,4};

        assertArrayEquals("Unexpected array", expected, Arrays.unique(array));
    }
}
