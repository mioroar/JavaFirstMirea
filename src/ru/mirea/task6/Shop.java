package ru.mirea.task6;

public class Shop implements Printable{
    private String name;
    public Shop(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Override
    public void print() {
        System.out.println("Print Shop: " + getName());
    }
    @Override
    public String toString() {
        return "Shop{" +
                "name='" + name + '\'' +
                '}';
    }
}
