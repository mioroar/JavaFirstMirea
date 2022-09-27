package ru.mirea.task2;

public class Shape {
    public String Name;
    public int Volume;
    public int Square;

    public Shape(String SName,int SVolume,int SSquare){
        Name=SName;
        Volume=SVolume;
        Square=SSquare;
    }

    public String toString() {
        return "Shape{"
                + "Name='" + Name + '\''
                + ", Square=" + Square
                + ", Volume=" + Volume
                + '}';
    }
}
