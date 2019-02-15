package com.amatsuka.utils.exceptions;

import java.util.List;

public class NumberArrayFormatException extends RuntimeException {

    private List<String> notReadedNumbers;

    public NumberArrayFormatException(List<String> notReadedNumbers) {
        super(makeMessageFromList(notReadedNumbers));

        this.notReadedNumbers = notReadedNumbers;
    }

    private static String makeMessageFromList(List<String> notReadedNumbers) {
        StringBuilder builder = new StringBuilder();

        for (String number : notReadedNumbers) {
            builder.append(number + " ");
        }

        builder.append("не удалось прочитать");

        return builder.toString();
    }

    public List<String> getNotReadedNumbers() {
        return notReadedNumbers;
    }
}
