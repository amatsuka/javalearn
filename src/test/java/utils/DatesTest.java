package utils;

import com.amatsuka.utils.Arrays;
import com.amatsuka.utils.Dates;
import org.junit.Test;

import java.util.Date;

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
    }
}
