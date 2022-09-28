package ru.mirea.task3;
import java.lang.Math;
public class Circle {
    private double Rad;
    private double CircLength;

    public Circle(double Rad){
        this.Rad=Rad;
    }
    public double getRad(){
        return Rad;
    }
    public void setRad(double Rad){
        this.Rad=Rad;
    }
    public double getCircLength(){
        return 2*Math.PI*Rad;
    }
    public String toString(){
        return String.format("Circle radius and length -  (%s, %g )",this.Rad,getCircLength());
    }
}
