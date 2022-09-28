package ru.mirea.task3;



public class BookTest {
    public static void main(String[] args) {
        Book a0 = new Book("Matveenko M.S.", "Money", 2017);
        Book a1 = new Book("Pushkin", "Onegin", 1823);
        Book a2 = new Book("Biba", "Mirea otchislenie", 2022);
        Book a3 = new Book("Drozd", "Birds", 1999);
        a0.setName("Java-rush");
        System.out.println(a1.getName());
        System.out.println(a2.getAuthor());
        System.out.println(a3.getYear());
        System.out.println(a0.ShowBook());
    }
}
