package ru.mirea.task4;

public class AuthorTest {
    public static void main(String[] args){

        Author x0 = new Author("Dima","superDima@mail.ru",'m');
        Author x1 = new Author("Boba","superBoba@mail.ru",'w');
        Author x2 = new Author("Biba","superBiba@mail.ru",'n');
        Author x3 = new Author("Max","superMax@mail.ru",'g');

        x0.setEmail("SuperPuperDima@mail.ru");
        System.out.println(x1.getName());
        System.out.println(x2.getEmail());
        System.out.println(x3.getGender());
        System.out.println(x0);
    }
}
