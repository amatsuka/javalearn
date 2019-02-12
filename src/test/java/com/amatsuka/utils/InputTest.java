package com.amatsuka.utils;

import org.hamcrest.Matchers;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertThat;
import static org.mockito.Matchers.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class InputTest {

    static final String STRING_INVITATION = "Введите строку";
    static final String INTEGER_INVITATION = "Введите целое число";
    static final String ARRAY_INVITATION = "Введите элементы массива через пробел. Для завершения ввода нажмите  Enter";


    private PrintStream err;
    private PrintStream out;

    @Before
    public void setUp() throws Exception {
        this.err = System.err;
        this.out = System.out;
    }

    @After
    public void tearDown() throws Exception {
        System.setOut(this.out);
        System.setErr(this.err);
    }

    private PrintStream setupMockedErr() {
        PrintStream mockedErr = mock(PrintStream.class);
        System.setErr(mockedErr);

        return mockedErr;
    }

    private PrintStream setupMockedOut() {
        PrintStream mockedOut = mock(PrintStream.class);
        System.setOut(mockedOut);

        return mockedOut;
    }

    @Test
    public void readIntegerArrayTest() {
        String input = "1 2 3 4 5\n";
        String wrongInput = "1 w 2 3 4 5\n";

        int[] expected = {1,2,3,4,5};

        InputStream mockInput;
        PrintStream mockOut;
        PrintStream mockErr;


        mockInput = new ByteArrayInputStream(input.getBytes());
        mockOut = this.setupMockedOut();

        assertThat(Input.readIntegerArray(mockInput), is(expected));
        verify(mockOut).println(eq(ARRAY_INVITATION));

        mockInput = new ByteArrayInputStream(wrongInput.getBytes());
        mockErr = this.setupMockedErr();

        assertThat(Input.readIntegerArray(mockInput), is(expected));
        verify(mockErr).println("Не удалось прочитать как число w");

    }

    @Test
    public void readIntegerArrayWithCustomMessageTest() {
        String input = "1 2 3 4 5\n";
        int[] expected = {1,2,3,4,5};

        String customMessage = "Введите массив";

        InputStream mockInput = new ByteArrayInputStream(input.getBytes());
        PrintStream mockOut = this.setupMockedOut();
        assertThat(Input.readIntegerArray(mockInput, customMessage), is(expected));

        verify(mockOut).println(eq(customMessage));

    }

    @Test
    public void readIntTest() {
        String input = "10\n";
        int expected = 10;

        InputStream mockInput;
        PrintStream mockOut;


        mockInput = new ByteArrayInputStream(input.getBytes());
        mockOut = this.setupMockedOut();

        assertThat(Input.readInt(mockInput), is(expected));
        verify(mockOut).println(eq(INTEGER_INVITATION));

    }

    @Test
    public void readIntWithCustomMessageTest() {
        String input = "10\n";
        int expected = 10;

        String customMessage = "Введите какоенибудь число";


        InputStream mockInput;
        PrintStream mockOut;


        mockInput = new ByteArrayInputStream(input.getBytes());
        mockOut = this.setupMockedOut();

        assertThat(Input.readInt(mockInput, customMessage), is(expected));
        verify(mockOut).println(eq(customMessage));
    }


    @Test
    public void readStringTest() {
        String input = "test string";

        InputStream mockInput;
        PrintStream mockOut;


        mockInput = new ByteArrayInputStream(input.getBytes());
        mockOut = this.setupMockedOut();

        assertThat(Input.readString(mockInput), is(input));
        verify(mockOut).println(eq(STRING_INVITATION));
    }

    @Test
    public void readStringWithCustomMessageTest() {
        String input = "test string";

        String customMessage = "Введите какуюнибудь строку";


        InputStream mockInput;
        PrintStream mockOut;


        mockInput = new ByteArrayInputStream(input.getBytes());
        mockOut = this.setupMockedOut();

        assertThat(Input.readString(mockInput, customMessage), is(input));
        verify(mockOut).println(eq(customMessage));
    }
}
