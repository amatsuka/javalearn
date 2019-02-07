package com.amatsuka.excercies.oop.generics.ex3_Table;


public class Table<K, V> {
    private final  Object[] items;

    public Table(int size) {
        this.items = new Object[size];
    }

    public boolean set(K key, V value) {
        final int index = this.findByKey(key);

        if (index >= 0) {
            this.items[index] = new Entry<>(key, value);

            return true;
        }

        final int place = this.findFreePlace();

        if (place < 0) {
            return false;
        }

        this.items[place] = new Entry<>(key, value);

        return true;
    }

    public boolean remove(K key) {
        final int index = this.findByKey(key);

        if (index < 0) {
            return false;
        }

        this.items[index] = null;

        return true;
    }

    public V get(K key) {
        final int index = this.findByKey(key);

        if (index < 0) {
            return null;
        }

        return ((Entry<K, V>)this.items[index]).getValue();
    }

    private int findFreePlace() {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                return i;
            }
        }

        return -1;
    }

    private int findByKey(K key) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                continue;
            }

            if (((Entry<K, V>)this.items[i]).getKey().equals(key)) {
                return i;
            }
        }

        return -1;
    }

    public String toString() {
        String result = "";

        for (Object entry : this.items) {
            result += (Entry<K, V>)entry + "\n";
        }

        return result;
    }
}
