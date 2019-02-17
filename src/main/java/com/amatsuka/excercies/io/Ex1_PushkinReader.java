package com.amatsuka.excercies.io;

import com.amatsuka.Main;
import com.amatsuka.contracts.RunnableExercise;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Consumer;
import java.util.stream.Stream;

/*
Задан файл со стихотворением Александра Пушкина.
Определить частоту повторяемости всех букв в стихотворении, игнорируя регистр.
Вывести результат в файл в виде:
а - 15
б - 7
и т.д.
 */
public class Ex1_PushkinReader implements RunnableExercise {
    @Override
    public void run() {
        Path filePath = Paths.get(Main.RESOURCES, "pushkin.txt");
        System.out.println(filePath);
        try {
            Stream<String> fileStream = this.readFileToStream(filePath);

            Map<Character, Integer> charsCount = this.calculateCharsCount(fileStream);

            printMap(charsCount);
        } catch (IOException e) {
            System.err.println("Не удалось прочитать файл");
        }
    }

    private Stream<String> readFileToStream(Path filePath) throws IOException {
        return Files.lines(filePath);
    }

    private Map<Character, Integer> calculateCharsCount(Stream<String> lines) {
        Map<Character, Integer> result = new TreeMap<>();

        Consumer<String> handler = (line) -> {
            for (Character ch : this.cleanLine(line).toCharArray()) {
                this.incrementMapForChar(result, ch);
            }
        };

        lines.forEach(handler);

        return result;
    }

    private String cleanLine(String line) {
        return line.replaceAll("[^a-zA-ZА-ЯЁа-яё]", "").toLowerCase();
    }

    private void incrementMapForChar(Map<Character, Integer> map, Character ch) {
        Integer count = map.getOrDefault(ch, 0);
        map.put(ch, count + 1);
    }

    private void printMap(Map<Character, Integer> charsCount) {
        StringBuilder builder = new StringBuilder();
        for (Map.Entry entry: charsCount.entrySet()) {

            builder.append(entry.getKey() + ":" + entry.getValue() + '\n');
        }

        System.out.println(builder);
    }

    @Override
    public String description() {
        return "Определить частоту повторяемости всех букв в стихотворении";
    }
}
