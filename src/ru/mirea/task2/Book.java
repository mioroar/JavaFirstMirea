package ru.mirea.task2;

public class Book {
    public String Author;
    public String Name;

    public Book(String author, String name){
        Author=author;
        Name=name;
    }

    public String getAut(String author) {
        return author;
    }

    public String getName(String name) {

        return name;
    }

    public String ShowBook(String author,String name) {
        String book = (author+" "+name);
        return book;
    }
}
