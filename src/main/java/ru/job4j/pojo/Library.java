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
        for (int i = 0; i < books.length; i++) {
            System.out.println("Название книги " + books[i].getName() + ". Количество страниц " + books[i].getCountList());
        }
        System.out.println("Меняем книги в массиве");
        Book swap = books[0];
        books[0] = books[3];
        books[3] = swap;
        for (int i = 0; i < books.length; i++) {
            System.out.println("Название книги " + books[i].getName() + ". Количество страниц " + books[i].getCountList());
        }
        for (int i = 0; i < books.length; i++) {
            if (books[i].getName() == "Clean Code") {
                System.out.println("Название \"Clean Code\" имеет книга под индексом " + i);
            }

        }
    }
}
