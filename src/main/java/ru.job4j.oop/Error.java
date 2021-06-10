package ru.job4j.oop;

public class Error {
    private boolean active;
    private int status;
    private String message;

    public Error() {

    }

    public Error(boolean active, int status, String message) {
     this.active = active;
     this.status = status;
     this.message = message;
    }

    public void printInfo() {
        System.out.println("Обнаружена ошибка " + active);
        System.out.println("Статус ошибки " + status);
        System.out.println(message);
    }

    public static void main(String[] args) {
        Error defaultError = new Error();
        defaultError.printInfo();
        Error errorOne = new Error(true, 1, "Программа аварийно завершена");
        errorOne.printInfo();
        Error noError = new Error(false, 0, "Программа работает в штатном режиме");
        noError.printInfo();
    }
}
