package com.amatsuka.utils;

import org.junit.Test;

import static org.junit.Assert.*;


public class DatesTest {

    @Test
    public void isHighYearTest() {
        int[] highYears = {2028, 2000, 1600, 400};
        int[] notHighYears = {100, 300, 2001};

        for (int year : highYears) {
            assertTrue(Dates.isHighYear(year));
        }

        for (int year : notHighYears) {
            assertFalse(Dates.isHighYear(year));
        }
    }

    @Test
    public void getMaxDayInMonthTest() {
        assertEquals(31, Dates.getMaxDayInMonth(1, 2000));
        assertEquals(29, Dates.getMaxDayInMonth(2, 2000));
        assertEquals(28, Dates.getMaxDayInMonth(2, 1999));
        assertEquals(30, Dates.getMaxDayInMonth(9, 1999));
    }

    @Test
    public void getNextDayDateTest() {
        assertEquals("10.11.2012", Dates.getNextDayDate(9, 11,2012));
        assertEquals("29.2.2000", Dates.getNextDayDate(28, 2,2000));
        assertEquals("1.3.2001", Dates.getNextDayDate(28, 2,2001));
        assertEquals("1.1.2001", Dates.getNextDayDate(31, 12,2000));
    }

    @Test
    public void getStringDate() {
        assertEquals("10.11.2012", Dates.getStringDate(10,11,2012));
    }
}
