package ru.mirea.task4;

public class Author {
    private String name;
    private String email;
    private char sex;

    public Author(String name,String email, char sex){
        this.name=name;
        this.email=email;
        this.sex=sex;
    }
    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }
    public char getSex(){
        return sex;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public String toString(){
        return String.format("Author - %s(%s), email - %s",name,sex,email);
    }
}
