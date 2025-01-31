package ru.mirea.task19.examples;

// Продемонстрировать применение оператора throw
class ThrowDemo {
    static void demoproc() {
        try {
            throw new NullPointerException("демонстрация"); // Создать объект стандартных исключений в Java
        } catch (NullPointerException e) {
            System.out.println("Исключение перехвачено в теле метода demoproc()");
            throw e; // повторно сгенерировать исключение
        }
    }

    public static void main (String[] args) {
        try {
            demoproc();
        } catch (NullPointerException e) {
            System.out.println("Повторный перехват: " + e);
        }
    }
}