package com.bridgelabz.Day5;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args){
        System.out.println("Enter an Integer number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num % 2 == 0)
            System.out.println(num + " " + "is even number");
        else
            System.out.println(num + " " + "is odd number");
    }
}
