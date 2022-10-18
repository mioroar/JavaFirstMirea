package ru.mirea.task6;

public class Farengeit implements Convertable{
    private double tF;

    public Farengeit( double tF) {

        this.tF = tF;
    }


    public double gettF() {
        return tF;
    }

    public void settF(double tF) {
        this.tF = tF;
    }

    @Override
    public double convert() {
        return (1.8* tF)+32;

    }
}
