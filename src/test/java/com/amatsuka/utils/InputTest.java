package com.amatsuka.utils;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.Assert.assertArrayEquals;

public class InputTest {
    @Test
    public void readIntegerArrayTest() {
        String input = "1 2 3 4 5\n";
        int[] expected = {1,2,3,4,5};

        InputStream mockInput = new ByteArrayInputStream(input.getBytes());
        InputStream stdin = System.in;

        try {
            System.setIn(mockInput);
            assertArrayEquals("Unexpected array", expected, Input.readIntegerArray(mockInput));
        } finally {
            System.setIn(stdin);
        }
    }
}
