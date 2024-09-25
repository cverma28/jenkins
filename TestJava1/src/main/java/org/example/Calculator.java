package org.example;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
         int num1 =scanner.nextInt();
        int num2 =scanner.nextInt();
        int result=num1+num2;
        System.out.println("sum is "+ result);
        System.out.println("minus is "+(num1-num2));
        System.out.println("multiply is "+(num1*num2));
        System.out.println("division "+(num1/num2));
        System.out.println("modules is "+(num1%num2));
    }
}
