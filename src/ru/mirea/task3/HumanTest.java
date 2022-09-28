package ru.mirea.task3;

public class HumanTest {
    public static void main(String[] args){
        Human man=new Human(60,'m');
        Human.Hand hands=man.new Hand(10,15);
        Human.Head head=man.new Head("blue",1);
        Human.Leg legs=man.new Leg(42,true);
        System.out.println(man);
        hands.setSize(45);
        System.out.println(hands);
        System.out.println(legs);
        System.out.println(head);
    }
}
