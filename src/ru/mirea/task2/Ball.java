package ru.mirea.task2;

public class Ball {
    public float rad;
    public Ball(float BallRad){
        rad=BallRad;
    }
    public float getRad() {
        return rad;
    }
    public double BallVolume(float rad){
        double v=(1.33333)*3.14*(rad*rad*rad);
        return v;
    }


}
