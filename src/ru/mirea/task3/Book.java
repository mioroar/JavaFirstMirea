package ru.mirea.task3;

public class Book {
    public String author;
    public String name;
    public int year;

    public Book(String author, String name,int year){
        this.author=author;
        this.name=name;
        this.year=year;
    }

    public String getAuthor() {
        return author;
    }

    public String getName() {
        return name;
    }
    public int getYear() {

        return year;
    }
    public void setAuthor(String author) {
        this.author=author;
    }

    public void setName(String name) {

        this.name=name;
    }
    public void setYear(int year) {

        this.year=year;
    }

    public String ShowBook() {
        String book = (author+" "+name+" "+year);
        return book;
    }
}