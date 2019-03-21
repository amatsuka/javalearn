package com.amatsuka.excercies.java8.hw1;

import com.amatsuka.contracts.RunnableExercise;
import com.github.javafaker.Faker;

import java.util.*;

/*
Пусть дан список строк List. Найдите в нем строку, содержащую максимальное число строчных букв.
Чтобы код правильно работал, когда входной список пуст, можете возвращать объект типа Optional<String>.
 */
public class Ex1_FindStringWithMaxLetters implements RunnableExercise {
    @Override
    public void run() {
        List<String> list = generateList(20);

        list.forEach(System.out::println);

        final Optional<String> maxLetterString = list.stream()
                .max(Comparator.comparing(string -> string.replaceAll("[^a-z]", "").length()));

        System.out.println();

        maxLetterString.ifPresentOrElse(System.out::println, () -> System.out.println("Список пуст"));
    }

    private List<String> generateList(int size) {
        Faker faker = new Faker();
        Random random = new Random();

        List<String> result = new LinkedList<>();

        for (int i = 0; i < size; i++) {
            result.add(faker.lorem().paragraph(random.nextInt(4) + 1));
        }

        return result;
    }

    @Override
    public String description() {
        return "Найдите в нем строку, содержащую максимальное число строчных букв";
    }
}
