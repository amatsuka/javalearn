package com.amatsuka.utils;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.Assert.assertArrayEquals;

public class InputTest {
    static final String STRING_INVITATION = "Введите строку";
    static final String INTEGER_INVITATION = "Введите целое число";
    static final String ARRAY_INVITATION = "Введите элементы массива через пробел. Для завершения ввода нажмите  Enter";

    @Test
    public void readIntegerArrayTest() {
        String input = "1 2 3 4 5\n";
        int[] expected = {1,2,3,4,5};

        InputStream mockInput = new ByteArrayInputStream(input.getBytes());
        InputStream stdin = System.in;

        try {
            System.setIn(mockInput);
            assertArrayEquals(expected, Input.readIntegerArray(mockInput));
        } finally {
            System.setIn(stdin);
        }
    }

    @Test
    public void readIntTest() {
    }


    @Test
    public void readStringTest() {
    }
}
