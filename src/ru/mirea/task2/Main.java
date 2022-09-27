package ru.mirea.task2;

public class Main {

    public static void main(String[] args){
        Shape shape=new Shape("Cube",1000,200);
        System.out.println(shape);
        //-------------------------------------------------------------------------
        Ball ball=new Ball(20);
        double r= ball.BallVolume(ball.rad);
        System.out.println("Volume of 20 radius ball = " + r);
        //-------------------------------------------------------------------------
        Book book=new Book("Matveenko M.S." , "Money" );
        System.out.println(book.ShowBook(book.Author,book.Name));
        //-------------------------------------------------------------------------
        Dog dog=new Dog("bobik",5);
        System.out.println(dog.toString());

    }

}
