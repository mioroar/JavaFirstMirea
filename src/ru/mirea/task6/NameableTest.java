package ru.mirea.task6;

public class NameableTest {
    public static void main(String[] args) {
        Person p1 =new Person("Max");
        Person p2 =new Person("Sergei");
        Nameable[] names = {p1,p2};
        for(Nameable name: names)
        {
            System.out.println(name);
        }
    }
}
