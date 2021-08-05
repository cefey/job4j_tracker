package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFio("Головлёв Вячеслав Анатольевич");
        student.setGroup("job4j");
        student.setReceiptDate(new Date());
        System.out.println(student.getFio() + " поступил в грурппу " + student.getGroup() + ". Дата: " + student.getReceiptDate());
    }
}
