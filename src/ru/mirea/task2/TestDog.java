package ru.mirea.task2;

import java.util.Scanner;
import java.util.Vector;

public class TestDog {
    public Vector<Dog> dog = new Vector<Dog>();
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        TestDog pesik = new TestDog();
        pesik.NewDog();
        pesik.PrintDogs();
    }
    public void NewDog(){
        Scanner sc = new Scanner(System.in);
        int n =3;
        for (int i=0; i<n; i++){
            System.out.println("Имя для собаки по номером "+(i+1)+": ");
            String name=sc.next();
            System.out.println("Возраст этой собаки: ");
            int age= sc.nextInt();
            dog.addElement(new Dog(name, age));
        }
    }
    public void PrintDogs(){
        for(int i = 0; i < dog.size(); i++) {
            System.out.println(dog.get(i).toString());
        }
    }
}
