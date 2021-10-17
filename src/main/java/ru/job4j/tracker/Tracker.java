package ru.job4j.tracker;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item findById(int id) {
        Item rsl = null;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item.getId() == id) {
                rsl = item;
                break;
            }
        }
        return rsl;
    }

   /*получение списка всех заявок*/
    public Item[] findAll() {
        return  Arrays.copyOf(items, size);
    }

    public Item[] findByName(String key) {
        Item[] first = findAll();
        Item[] rls = new Item[size];
        int inc = 0;
        for (int i = 0; i < first.length; i++) {
            if (first[i].getName().equals(key)) {
                rls[inc++] = first[i];
            }
        }
        return  Arrays.copyOf(rls, inc);
    }

}