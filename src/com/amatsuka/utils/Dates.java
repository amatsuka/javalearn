package com.amatsuka.utils;

public class Dates {

    public boolean isHighYear(final int year) {
         if ((year%100 == 0) && !(year%400 == 0)) return false;

         return year%4 == 0;
    }

    public getMaxDayInMonth(final int month, final int year) {

    }
}
