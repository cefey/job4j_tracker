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

    public boolean replace(int id, Item item) {
        int index = indexOf(id);
        if (index != -1) {
            item.setId(id);
            items[index] = item;
            return true;
        }
        return false;
    }

    public Item findById(int id) {
    /* Находим индекс */
    int index = indexOf(id);
    /* Если индекс найден возвращаем item, иначе null */
    return index != -1 ? items[index] : null;
    }

    public Item[] findAll() {
        return  Arrays.copyOf(items, size);
    }

    public Item[] findByName(String key) {
        Item[] rls = new Item[size];
        int inc = 0;
        for (int i = 0; i < size; i++) {
            if (items[i].getName().equals(key)) {
                rls[inc++] = items[i];
            }
        }
        return  Arrays.copyOf(rls, inc);
    }

    private int indexOf(int id) {
        int rsl = -1;
        for (int index = 0; index < size; index++) {
            if (items[index].getId() == id) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }
}