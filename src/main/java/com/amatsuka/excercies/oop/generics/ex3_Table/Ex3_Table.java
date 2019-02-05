package com.amatsuka.excercies.oop.generics.ex3_Table;

import com.amatsuka.contracts.RunnableExercise;

/*
Реализуйте обобщенный класс Table<K, V>,
управляющий списочным массивом, состоящим из элементов типа Entry<K, V>.
Предоставьте методы для получения значения, связанного с ключом,
установки значения по заданному ключу и удаления ключа.
 */
public class Ex3_Table implements RunnableExercise {
    @Override
    public void run() {
        Table<Integer, String> table = new Table<>(10);

        for (int i = 0; i < 10; i++) {
            table.set(i*5, "ts ".repeat(i));
        }

        System.out.println(table);

        System.out.println(table.set(15, "15 ts"));
        System.out.println(table);

        System.out.println(table.set(56, "56 ts"));
        System.out.println(table);

        System.out.println(table.remove(15));

        System.out.println(table);

        System.out.println(table.set(100, "test"));

        System.out.println(table);
    }

    @Override
    public String description() {
        return "Обобщенный класс Table<K, V>";
    }
}
