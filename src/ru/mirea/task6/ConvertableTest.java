package ru.mirea.task6;

public class ConvertableTest {
    public static void main(String[] args) {
        Farengeit f1 = new Farengeit(36.6);
        Kelvin k1 = new Kelvin(39);

        System.out.println("36.6 tC -> " + f1.convert()+ " tF");
        System.out.println("39 tC -> " + k1.convert() + " tK");
    }
}
