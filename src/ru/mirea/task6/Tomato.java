package ru.mirea.task6;

public class Tomato implements Priceable{
    private double price;
    private String name;
    public Tomato(double price,String name){
        this.price=price;
        this.name=name;
    }
    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "price=" + getPrice() +
                ", name='" + name  +
                '}';
    }
}
