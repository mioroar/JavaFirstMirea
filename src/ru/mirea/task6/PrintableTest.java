package ru.mirea.task6;

public class PrintableTest {
    public static void main(String[] args) {
        Book b1 = new Book("flame");
        Book b2 = new Book("groza");
        Shop sh1 = new Shop("auchan");
        Shop sh2 = new Shop("zarya");
        Printable[] print ={b1,b2,sh1,sh2};
        for(Printable printable:print){
            printable.print();
        }
    }
}
