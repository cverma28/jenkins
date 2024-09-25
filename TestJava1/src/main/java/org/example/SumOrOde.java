package org.example;

import java.util.Scanner;

public class SumOrOde
{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();

        if(num%2==0) {
            System.out.println("number is even");
            System.out.println("Done1");
        }

        else {
            System.out.println("number is odd");
            System.out.println("Done2");
        }
    }
}
