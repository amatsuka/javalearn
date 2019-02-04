package com.amatsuka.utils;

public final class Arithmetic {
    private Arithmetic() {}

    public static int discriminant(final int a, final int b, final int c) {
        return b*b - 4*a*c;
    }

    public static boolean isPositive(int number) {
        return number > 0;
    }

    public static boolean isZero(int number) {
        return number == 0;
    }
}
