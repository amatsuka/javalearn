package com.amatsuka.utils;

public abstract class Strings {
    public static int sumOfStringNumber(final String number) throws NumberFormatException {
        int result = 0;

        for (int i = 0; i < number.length(); i++) {
            result += Integer.parseInt(Character.toString(number.charAt(i)));
        }

        return result;
    }
}
