package ru.mirea.task2;

public class Dog {
    public String name;
    public int age;

    public Dog(String name,int age){
        this.name=name;
        this.age=age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public void SetName(String name){

        this.name=name;
    }
    public void SetAge(int age){
        this.age=age;
    }
    public int Human_Dog_Age(){
        return age*7;
    }
    public String toString()
    {
        return name + " " +  Human_Dog_Age()+" лет в человеческом виде";
    }
}
