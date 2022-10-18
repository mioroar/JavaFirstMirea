package ru.mirea.task6;

public class PriceableTest {
    public static void main(String[] args) {

        Tomato t1 =new Tomato(75.46,"Teplichnie");
        Tomato t2 = new Tomato(69.90,"Armenia");
        Tomato t3 = new Tomato(240,"Rozovie");

        Priceable[] prices = {t1,t2,t3};
        for(Priceable price:prices){
            System.out.println(price);
        }
    }
}
