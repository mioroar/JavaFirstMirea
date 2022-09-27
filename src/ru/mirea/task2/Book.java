package ru.mirea.task2;

public class Book {
    public String author;
    public String name;

    public Book(String author, String name){
        this.author=author;
        this.name=name;
    }

    public String getAuthor(String author) {
        return author;
    }

    public String getName(String name) {

        return name;
    }
    public void setAuthor(String author) {
        this.author=author;
    }

    public void setName(String name) {

        this.name=name;
    }

    public String ShowBook(String author,String name) {
        String book = (author+" "+name);
        return book;
    }
}
