package com.amatsuka.excercies.concurrent.hw2;

import java.util.LinkedList;
import java.util.Random;
import java.util.concurrent.locks.*;

public class ConcurrentRandomList {
    private int maxCountOfElements = 10;

    private LinkedList<Integer> list = new LinkedList<>();

    private final Lock lock = new ReentrantLock();
    private final Condition empty = lock.newCondition();
    private final Condition full = lock.newCondition();

    private boolean funnyMode = false;

    public ConcurrentRandomList() {
    }

    public ConcurrentRandomList(int maxCountOfElements) {
        this.maxCountOfElements = maxCountOfElements;
    }

    public void produce() throws InterruptedException {
        lock.lock();
        try {
        if (list.size() >= maxCountOfElements) {
            showFunnyMessageIfAllow("@Писатель: Таак много уже написано, отдохну");

            full.await();

            showFunnyMessageIfAllow("@Писатель: Говорят в есть место для моего творчества в этом жестоком мире");
        }


        Random random = new Random();
        list.add(random.nextInt());

        System.out.println("Добавлен элемент. Размер:" + list.size());

        showFunnyMessageIfAllow("@Писатель: Эй, читатель! Почитай мой шедевр!");
        empty.signal();

        } catch (InterruptedException e) {
            throw e;

        } finally {
            lock.unlock();
        }
    }

    public void consume() throws InterruptedException {

        lock.lock();
        try {
        if (list.isEmpty()) {
            showFunnyMessageIfAllow("#Читатель " + Thread.currentThread().getName() + ": Совсем нечего почитать, подожду пока писатель что-нибудь выдаст этакое");


                empty.await();
                showFunnyMessageIfAllow("#Читатель " + Thread.currentThread().getName() + ": Говорят появилось что-то стоящее!");

        }

        showFunnyMessageIfAllow("#Читатель " + Thread.currentThread().getName() + ": Заценим-ка ;)");

        list.removeFirst();

        System.out.println("Удален элемент. Размер:" + list.size());
        showFunnyMessageIfAllow("#Читатель " + Thread.currentThread().getName() + ": Почитал, фигня какаято(");


        if (list.size() < maxCountOfElements) {
            showFunnyMessageIfAllow("#Читатель " + Thread.currentThread().getName() + ": Эй, писатель! Подкинь годноты!");
            full.signal();
        }

        } catch (InterruptedException e) {
            throw e;

        } finally {
            lock.unlock();

        }

        Random random = new Random();
        Thread.sleep(random.nextInt(10) * 1000);
    }

    public void setFunnyMode(boolean funnyMode) {
        this.funnyMode = funnyMode;
    }

    private void showFunnyMessageIfAllow(String message) {
        if (funnyMode) {
            System.out.println(message);
        }
    }
}
