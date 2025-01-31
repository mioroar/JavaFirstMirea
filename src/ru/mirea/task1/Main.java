package ru.mirea.task1;

import java.util.Scanner;
import java.util.Random;



public class Main {
    public static void main(String[] args) {
        /*          задание 1             */
        System.out.println("First task ---------------------------------------------------------------------------------");
        Scanner sc = new Scanner(System.in);
        int sum = 0;
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
        System.out.println(sum);
        //---------------------------------------------------------------------------------
        /*          задание 2             */
        System.out.println("Second task --------------------------------------------------------------------------------- ");
        System.out.println("Arguments: ");
        for(int i = 0; i < args.length; i++)
        {
            System.out.println(args.length);
        }
        //---------------------------------------------------------------------------------
        /*          задание 3             */
        System.out.println("Third task --------------------------------------------------------------------------------- ");
        for (int i = 0; i < 11; i++) {
            System.out.println(1./i);
        }
        //---------------------------------------------------------------------------------
        /*          задание 4             */
        System.out.println("Fourth task ---------------------------------------------------------------------------------");
        // первый способ
        System.out.println("First way with Math.random");
        int[] MyMass2 = new int[10];
        for (int i =0;i< MyMass2.length;i++){
            MyMass2[i] = (int)(Math.random()*255);
        }
        for (int i =0;i< MyMass2.length;i++){
            System.out.print(MyMass2[i] + " ");
        }
        System.out.println();
        for(int i = MyMass2.length-1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){

                if( MyMass2[j] > MyMass2[j+1] ) {
                    int tmp = MyMass2[j];
                    MyMass2[j] = MyMass2[j + 1];
                    MyMass2[j + 1] = tmp;
                }
            }
        }
        for (int i =0;i< MyMass2.length;i++){
            System.out.print(MyMass2[i] + " ");
        }
        System.out.println();
        //---------------------------------------------------------------------------------
        // второй способ
        System.out.println("Second way way with class Random ");
        int[] MyMass3 = new int[10];
        Random random = new Random();
        for (int i =0;i< MyMass3.length;i++){
            MyMass3[i] = random.nextInt(255);
        }
        for (int i =0;i< MyMass3.length;i++){
            System.out.print(MyMass3[i] + " ");
        }
        System.out.println();
        for(int i = MyMass3.length-1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){

                if( MyMass3[j] > MyMass3[j+1] ) {
                    int tmp = MyMass3[j];
                    MyMass3[j] = MyMass3[j + 1];
                    MyMass3[j + 1] = tmp;
                }
            }
        }
        for (int i =0;i< MyMass3.length;i++){
            System.out.print(MyMass3[i] + " ");
        }
        System.out.println();
        //---------------------------------------------------------------------------------
        /*          задание 5             */
        System.out.println("Fifth task ---------------------------------------------------------------------------------1");
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