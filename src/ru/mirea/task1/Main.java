package ru.mirea.task1;

import java.util.Scanner;
import java.util.Random;



public class Main {
    public static void main(String[] args) {
        /*          задание 1             */
        Scanner sc = new Scanner(System.in);
        /*int sum = 0;
        int[] MyMass = new int[10];
        for(int i = 0;i< MyMass.length;i++){
            System.out.print("Enter ");
            System.out.print(i);
            System.out.println(" element for ur massive");
            MyMass[i] = sc.nextInt();

        }
        for(int i = 0;i< MyMass.length;i++){
            sum += MyMass[i];
        }
        System.out.print("Sum of elements: ");
        System.out.println(sum);
        /*          задание 2             */
        for(int i = 0; i < args.length; i++)
        {
            System.out.println(args.length);
        }
        /*          задание 3             */

        //for (int i = 0; i < 11; i++) {
         //   System.out.println(1./i);
        //}
        /*          задание 4             */
        // первый способ
        int[] MyMass2 = new int[10];
        for (int i =0;i< MyMass2.length;i++){
            MyMass2[i] = (int)(Math.random()*255);
        }
        for (int i =0;i< MyMass2.length;i++){
            System.out.print(MyMass2[i] + " ");
        }
        System.out.println();
        // второй способ
        int[] MyMass3 = new int[10];
        Random random = new Random();
        for (int i =0;i< MyMass2.length;i++){
            MyMass3[i] = random.nextInt(255);
        }
        for (int i =0;i< MyMass2.length;i++){
            System.out.print(MyMass3[i] + " ");
        }
        System.out.println();
        /*          задание 5             */
        System.out.print("Enter number for factorial: ");
        int n;
        n = sc.nextInt();
        Factorial(n);
    }
    static void Factorial(int n){ //метод для 5 задания
        int result = 1;
        for(int i = 1; i<=n; i++){
            result *= i ;
        }
        System.out.println(result);
    }
}