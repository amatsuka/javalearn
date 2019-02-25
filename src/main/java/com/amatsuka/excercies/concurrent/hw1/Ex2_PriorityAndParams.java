package com.amatsuka.excercies.concurrent.hw1;

import com.amatsuka.contracts.RunnableExercise;

/*
Создайте атрибуты нити. Установите приоритет нити.
Запустите нить с указанными атрибутами, распечатайте приоритет и атрибуты нити.
Убедитесь, что параметры соответствуют установленным.
 */
public class Ex2_PriorityAndParams implements RunnableExercise {
    @Override
    public void run() {
        Thread thread = new Thread(() -> {
            System.out.println("Thread name is " + Thread.currentThread().getName());
            System.out.println("Thread priority is " + Thread.currentThread().getPriority());

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {}

            System.out.println("Thread bye-bye ;)");
        });

        thread.setPriority(Thread.MAX_PRIORITY);
        thread.setName("My thread");
        thread.start();
    }

    @Override
    public String description() {
        return "Создайте атрибуты нити. Установите приоритет нити.";
    }
}
