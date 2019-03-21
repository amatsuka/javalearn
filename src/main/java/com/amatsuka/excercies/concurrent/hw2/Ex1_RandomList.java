package com.amatsuka.excercies.concurrent.hw2;

import com.amatsuka.contracts.RunnableExercise;

/*
Задан LinkedList, представляющий собой хранилище целых чисел.
Метод produce бесконечно добавляет в этот список случайные числа, однако максимальное количество, которое он может добавить равно 10.
Метод consume бесконечно считывает числа с какой-то случайной задержкой (от 0 до 10 мс).\
Сделать так, чтобы метод produce добавлял числа только тогда, когда не превышен лимит, а метод consume забирал их только тогда,
когда в списке что-нибудь есть.

Методы должны корректно работать в многопоточной среде. Используйте отдельную блокировку чтения-записи.
Использовать метод removeFirst у LinkedList для получения элемента. Создать и запустить два различных потока,
один из которых вызывает produce, а другой - consume.
Продемонстрировать корректность работы хранилища с помощью вывода сообщений в консоль о добавлении,
получении и текущем размере хранилища на этапах добавления и получения.
 */
public class Ex1_RandomList implements RunnableExercise {
    @Override
    public void run() {

        //System.setOut(System.err);
        ConcurrentRandomList list = new ConcurrentRandomList();

        //Comment it out if you want to have fun
        list.setFunnyMode(true);


        Runnable writer = () -> {
            while (!Thread.currentThread().isInterrupted()) {
                try {
                    list.produce();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        };

        Runnable reader = () -> {
            while (!Thread.currentThread().isInterrupted()) {
                try {
                    list.consume();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        };

        new Thread(reader).start();
        new Thread(reader).start();
        new Thread(reader).start();
        new Thread(reader).start();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        new Thread(writer).start();

    }

    @Override
    public String description() {
        return "Задан LinkedList, представляющий собой хранилище целых чисел";
    }
}
