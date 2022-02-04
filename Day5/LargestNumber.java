package com.bridgelabz.Day5;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args){
        System.out.println("Enter three numbers: ");
        Scanner sc = new Scanner(System.in);
        int a, b, c, temp, largest;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        temp = a > b ? a : b;
        largest = c > temp ? c : temp;
        System.out.println("The Largest number is " + largest);
    }
}
