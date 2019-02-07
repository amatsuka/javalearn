package com.amatsuka.excercies.oop.collections.hw_2;

import com.amatsuka.contracts.RunnableExercise;

import java.util.Map;
import java.util.TreeMap;

/*
Задан текст на английском языке. Выделить все различные слова.
Для каждого слова подсчитать частоту его встречаемости.
Слова, отличающиеся регистром букв, считать различными.
Воспользуйтесь для этой цели классом TreeMap<String, Integer>.
 */
public class Ex1_DifferentWords implements RunnableExercise {
    @Override
    public void run() {
        String text = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. " +
                "Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, " +
                "when an unknown printer took a galley of type and scrambled it to make a type specimen book. " +
                "It has survived not only five centuries, but also the leap into electronic typesetting, " +
                "remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset " +
                "sheets containing Lorem Ipsum passages, and more recently with desktop publishing software " +
                "like Aldus PageMaker including versions of Lorem Ipsum.";

        String[] words = text.split(" ");

        Map<String, Integer> wordsMap = new TreeMap<>();

        for (String word : words) {
            Integer val = wordsMap.getOrDefault(word, 1);
            wordsMap.put(word, val + 1);
        }

        StringBuilder builder = new StringBuilder();

        for (Map.Entry entry: wordsMap.entrySet()) {
            builder.append(entry.getKey() + ":" + entry.getValue() + '\n');
        }

        System.out.println(builder);
    }

    @Override
    public String description() {
        return "Задан текст на английском языке. Выделить все различные слова";
    }
}
