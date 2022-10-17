package ru.job4j.ex;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rsl = -1;
        /* цикл fori, поскольку нам надо найти индекс искомого элемента в массиве */
        for (int i = 0; i < value.length; i++) {
            if (key == value[i]) {
                rsl = i;
            }
        }
        if (rsl == -1) {
            throw new ElementNotFoundException("Element not found");
        }
        return rsl;
    }

    public static void main(String[] args) {
        String[] test = {"Каждый", "охотник", "желает", "знать", "где", "сидит", "фазан"};
        try {
            indexOf(test, "кабан");
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}