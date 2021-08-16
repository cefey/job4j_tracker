package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book javaForDummies = new Book("Java for Dummies", 429);
        Book cleanCode = new Book("Clean Code", 500);
        Book deepToSpring = new Book("Deep to Spring", 724);
        Book effectiveJava = new Book("Effective Java", 501);
        Book[] books = new Book[4];
        books[0] = javaForDummies;
        books[1] = cleanCode;
        books[2] = deepToSpring;
        books[3] = effectiveJava;
        for (Book bk:books) {
            System.out.println("Название книги " + bk.getName() + ". Количество страниц " + bk.getCountList());
        }
        System.out.println("Меняем книги в массиве");
        Book swap = books[0];
        books[0] = books[3];
        books[3] = swap;
        for (Book bk:books) {
            System.out.println("Название книги " + bk.getName() + ". Количество страниц " + bk.getCountList());
        }
        System.out.println("Перечень книг");
        for (Book bk:books) {
            if (bk.getName().equals("Clean Code")) {
                System.out.println(bk.getName());
            }

        }
    }
}