package ru.mirea.task18.examples;

// Пример, когда исключение не обрабатывается
class Exc0 {
    static void sub() {
        int d = 0;
        int a = 10 / d;
    }

    public static void main(String[] args) {
        Exc0.sub();
    }
}