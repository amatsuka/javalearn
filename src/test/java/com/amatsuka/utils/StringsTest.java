package com.amatsuka.utils;

import org.junit.Test;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

public class StringsTest {

    @Test
    public void sumOfStringNumberTest() {
        String input = "1234";

        assertThat(Strings.sumOfStringNumber(input), is(equalTo(10)));

    }


    @Test(expected = NumberFormatException.class)
    public void sumOfWrongStringNumberThrowsException() {
        String input = "w1230W";

        Strings.sumOfStringNumber(input);
    }
}