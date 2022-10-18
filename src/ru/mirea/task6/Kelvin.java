package ru.mirea.task6;

public class Kelvin implements Convertable {
    private double tK;
    public double getTK() {
        return tK;
    }

    public void setCem(double tK) {
        this.tK= tK;
    }

    public Kelvin(double tK) {
        this.tK = tK;
    }


    @Override
    public double convert() {
        return tK+273.15 ;
    }
}
