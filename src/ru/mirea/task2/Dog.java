package ru.mirea.task2;

public class Dog {
    public String Name;
    public int Age;

    public Dog(String n,int a){
        Name=n;
        Age=a;
    }
    public void SetName(String n){
        Name=n;
    }
    public void SetAge(int a){
        Age=a;
    }
    public int Human_Dog_age(int a){
        a *=7;
        return a;
    }
    public String toString()
    {
        return Name + " " + Age;
    }
}
