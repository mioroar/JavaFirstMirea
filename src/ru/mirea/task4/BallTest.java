package ru.mirea.task4;

public class BallTest {
    public static void main(String[] args){
        Ball ball = new Ball(2,5);
        ball.setX(20);
        ball.setY(25);
        System.out.println("X ="+ball.getX()+ " "+ "Y = "+ball.getY());
        ball.setXY(17,44);
        System.out.println("X ="+ball.getX()+ " "+ "Y = "+ball.getY());
        ball.move(-5,-14);
        System.out.println(ball);

    }
}
