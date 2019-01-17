package com.amatsuka.utils;

public class Dates {

    public static boolean isHighYear(final int year) {
         if ((year%100 == 0) && !(year%400 == 0)) return false;

         return year%4 == 0;
    }

    public static int getMaxDayInMonth(final int month, final int year) {
        //Апрель, июнь, сентябрь, ноябрь - 30 дней       Февраль - 28 дней в обычный год, 29 дней в високосный

        switch (month) {
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
                return isHighYear(year) ? 29 : 28;
        }

        return 31;
    }
}
