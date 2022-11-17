package ru.mirea.task18.examples;

// Продемонстрировать применение оператора finally
class FinallyDemo {

    // сгенерировать исключение в методе
    static void procA() {
        try {
            System.out.println("B теле метода procA()");
            throw new RuntimeException("демонстрация");
        } finally {
            System.out.println("Блок оператора finally в методе procA()");
        }
    }

    // возвратить управление из блока оператора try
    static void procB() {
        try {
            System.out.println("B теле метода procB()");
            return;
        } finally {
            System.out.println("Блок оператора finally в методе procB()");
        }
    }

    // выполнить блок try, как обычно
    static void procC() {
        try {
            System.out.println("B теле метода procC()");
        } finally {
            System.out.println("Блок оператора finally в методе procC()");
        }
    }

    public static void main(String[] args) {
        try {
            procA();
        } catch (Exception e) {
            System.out.println("Исключение перехвачено");
        }

        procB();
        procC();
    }
}
