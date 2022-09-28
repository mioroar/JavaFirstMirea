package ru.mirea.task2;

public class Main {

    public static void main(String[] args){

        //-------------------------------------------------------------------------
        Ball ball=new Ball(20);
        double r= ball.BallVolume(ball.rad);
        System.out.println("Volume of 20 radius ball = " + r);
        //-------------------------------------------------------------------------
        Book book=new Book("Matveenko M.S." , "Money" );
        System.out.println(book.ShowBook(book.author,book.name));
        //-------------------------------------------------------------------------

    }

}
