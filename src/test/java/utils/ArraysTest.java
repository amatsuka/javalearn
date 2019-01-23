package utils;

import com.amatsuka.utils.Arrays;
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
    public void readIntegerArrayTest() {
        String input = "1 2 3 4 5\n";
        int[] expected = {1,2,3,4,5};

        InputStream mockInput = new ByteArrayInputStream(input.getBytes());
        InputStream stdin = System.in;

        try {
            System.setIn(mockInput);
            assertArrayEquals("Unexpected array", expected, Arrays.readIntegerArray(mockInput));
        } finally {
            System.setIn(stdin);
        }
    }
}
