package com.amatsuka.utils;

public abstract class Arithmetic {
    public static int discriminant(final int a, final int b, final int c) {
        return b^2 - 4*a*c;
    }

    public static boolean isPositive(int number) {
        return number > 0;
    }

    public static boolean isZero(int number) {
        return number == 0;
    }
}
