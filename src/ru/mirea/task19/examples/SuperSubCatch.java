package ru.mirea.task19.examples;


class SuperSubCatch {
    public static void main(String[] args) {
        try {
            int a = 0;
            int b = 10 / a;
        } catch (Exception e) {
            System.out.println("Перехват исключений общего класса Exception.");
        }
    }
}