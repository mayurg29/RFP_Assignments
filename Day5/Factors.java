package com.bridgelabz.Day5;

import java.util.Scanner;

public class Factors {
    public static void main(String[] args){
        System.out.print("Number to find the prime factors: ");
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 2; i <= N; i++) {
            if ( N % i == 0)
                System.out.print(i + "\t");
        }
    }
}
