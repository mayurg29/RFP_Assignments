package com.bridgelabz.Day6;

import java.util.Scanner;

public class Reverse_a_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int rev = 0;

        while (num > 0){
            int digit = num % 10;
            rev = rev * 10 + digit;
            num /= 10;
        }
        System.out.println("Reversed number= "+rev);
    }
}
