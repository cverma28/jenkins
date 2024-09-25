package org.example;

import java.util.Scanner;

public class Program2 {
    public static void main(String[] args){
        Scanner object1 =new Scanner(System.in);
        System.out.print("enter first no." );
        int num1= object1.nextInt();
        System.out.print("enter second no.");
        int num2= object1.nextInt();
        System.out.println("enter third no.");
        float num3= object1.nextFloat();



         int result1=num1+num2;
        System.out.println("Int Output "+result1);


        float result2=num1+num2+num3;
        System.out.println("Float Output "+result2);


    }
}

