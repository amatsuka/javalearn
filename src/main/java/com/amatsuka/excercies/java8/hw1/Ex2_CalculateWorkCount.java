package com.amatsuka.excercies.java8.hw1;

import com.amatsuka.contracts.RunnableExercise;
import com.github.javafaker.Faker;

import java.util.*;
import java.util.stream.Collectors;

/*
Пусть дан поток, элементы которого - слова. Посчитайте, сколько раз встречается каждое слово.
При следующих исходных данных должен быть возвращен такой объект Мар:[John -> 3, Paul -> 2, George -> 1]:
Stream<String> names = Stream.of("John", "Paul", "George", "John", "Paul", "John")
 */
public class Ex2_CalculateWorkCount implements RunnableExercise {
    @Override
    public void run() {
        List<String> list = generateList(10);

        list.forEach(System.out::println);

        //TODO Найти фукцию заменить word -> word
        Map<String, Long> result = list.stream().collect(Collectors.groupingBy(word -> word, Collectors.counting()));

        System.out.println(result);

    }

    private List<String> generateList(int size) {
        Faker faker = new Faker();

        List<String> result = new LinkedList<>();

        for (int i = 0; i < size; i++) {
            result.add(faker.lorem().word());
        }

        return result;
    }

    @Override
    public String description() {
        return "Посчитайте, сколько раз встречается каждое слово";
    }
}
