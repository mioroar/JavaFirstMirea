package ru.mirea.task6;

public class MovableTest {
    public static void main(String[] args) {
        Movable p = new MovablePoint(5,5,6,10);
        System.out.println(p);
        p.moveLeft();
        System.out.println(p);

        Movable circle = new MovableCircle(2,1,2,3,20);

        System.out.println(circle);
        circle.moveDown();
        System.out.println(circle);

        Movable p2 = new MovablePoint(3,3,8,11);
        Movable p3 = new MovablePoint(4,5,8,11);
        Movable m2 = new MovableRectangle((MovablePoint) p2,(MovablePoint) p3);
        System.out.println(m2);
        m2.moveRight();
        System.out.println(m2);


    }
}
