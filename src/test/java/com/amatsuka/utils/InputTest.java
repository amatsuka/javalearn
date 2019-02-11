package com.amatsuka.utils;

import org.hamcrest.Matchers;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertThat;

public class InputTest {

    static final String STRING_INVITATION = "Введите строку";
    static final String INTEGER_INVITATION = "Введите целое число";
    static final String ARRAY_INVITATION = "Введите элементы массива через пробел. Для завершения ввода нажмите  Enter";

    @Test
    public void readIntegerArrayTest() {
        String input = "1 2 3 4 5\n";
        String wrongInput = "1 w 3 5\n";

        int[] expected = {1,2,3,4,5};

        InputStream mockInput;

        mockInput = new ByteArrayInputStream(input.getBytes());
        assertThat(Input.readIntegerArray(mockInput), is(expected));
        //TODO проверить вывод c помощью мокито

        mockInput = new ByteArrayInputStream(wrongInput.getBytes());

        assertThat(Input.readIntegerArray(mockInput), is(expected));
        //TODO проверить что в err выводилось сообщение


    }

    @Test
    public void readIntegerArrayWithCustomMessageTest() {
        String input = "1 2 3 4 5\n";
        int[] expected = {1,2,3,4,5};

        String customMessage = "Введите массив";

        InputStream mockInput = new ByteArrayInputStream(input.getBytes());

        assertThat(Input.readIntegerArray(mockInput, customMessage), is(expected));

        //TODO проверить вывод c помощью мокито


    }

    @Test
    public void readIntTest() {
        String string = "10";
    }

    @Test
    public void readIntWithCustomMessageTest() {

    }


    @Test
    public void readStringTest() {
    }

    @Test
    public void readStringWithCustomMessageTest() {
    }
}
