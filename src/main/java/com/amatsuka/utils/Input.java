package com.amatsuka.utils;

import com.amatsuka.utils.exceptions.NumberArrayFormatException;
import com.amatsuka.utils.exceptions.ParseStrategyNotFoundException;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Input {

    private static Scanner makeScanner(InputStream inputStream) {
        return new Scanner(inputStream);
    }

    public static int readInt(InputStream inputStream, String message) {
        System.out.println(message);
        return makeScanner(inputStream).nextInt();
    }

    public static int readInt(InputStream inputStream) {
        return readInt(inputStream, "Введите целое число");
    }

    public static String readString(InputStream inputStream, String message) {
        System.out.println(message);
        return makeScanner(inputStream).nextLine();
    }

    public static String readString(InputStream inputStream) {
        return readString(inputStream, "Введите строку");
    }

    @Deprecated
    public static int[] readIntegerArray(InputStream stream) {
        return readIntegerArray(stream, "Введите элементы массива через пробел. Для завершения ввода нажмите  Enter");
    }

    @Deprecated
    public static int[] readIntegerArray(InputStream stream, String message) {
        Scanner sc = new Scanner(stream);

        System.out.println(message);

        String inputString = sc.nextLine();

        ArrayList<Integer> input = new ArrayList<>();

        for (String number : inputString.split(" ")) {
            try {
                input.add(Integer.parseInt(number));
            } catch (NumberFormatException e) {
                System.err.println("Не удалось прочитать как число " + number);
            }
        }

        return input.stream().mapToInt(i -> i).toArray();
    }

    public static  <T extends Number> List<T> readNumberArray(Class<T> type, InputStream stream) {
        return readNumberArray(type, stream, "Введите элементы массива через пробел. Для завершения ввода нажмите  Enter");
    }

    public static <T extends Number> List<T> readNumberArray(Class<T> type, InputStream stream, String message) {
        Scanner sc = new Scanner(stream);

        ParseStrategy<T> parseStrategy = parseStrategyFactory(type);

        System.out.println(message);

        String inputString = sc.nextLine();

        List<T> input = new ArrayList<>();
        List<String> notReadedNumbers = new LinkedList<>();

        for (String number : inputString.split(" ")) {
            try {
                input.add(parseStrategy.parse(number));
            } catch (NumberFormatException e) {
                notReadedNumbers.add(number);
            }
        }

        if (!notReadedNumbers.isEmpty()) {
            throw new NumberArrayFormatException(notReadedNumbers);
        }

        return input;
    }

    private static<T extends Number> ParseStrategy<T> parseStrategyFactory(Class<T> type) throws ParseStrategyNotFoundException {
        if (type.equals(Integer.class)) {
            return (ParseStrategy<T>) new IntegerParseStrategy();
        }

        if (type.equals(Double.class)) {
            return (ParseStrategy<T>) new DoubleParseStrategy();
        }

        throw new ParseStrategyNotFoundException();
    }

    /**
     * @TODO перенести в отдельный пакет и разнести по файлам
     */
    interface ParseStrategy<T extends Number> {
        T parse(String value) throws NumberFormatException;
    }

    static class IntegerParseStrategy implements ParseStrategy<Integer> {

        @Override
        public Integer parse(String value) throws NumberFormatException {
            return Integer.parseInt(value);
        }
    }

    static class DoubleParseStrategy implements ParseStrategy<Double> {

        @Override
        public Double parse(String value) throws NumberFormatException {
            return Double.parseDouble(value);
        }
    }
}
