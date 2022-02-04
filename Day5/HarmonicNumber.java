package com.bridgelabz.Day5;

import java.util.Scanner;

public class HarmonicNumber {
    public static void main(String[] args){
        System.out.print("Enter any number: ");
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        double Nth_harmonic = 0;
        for (int i = 1; i <= N; i++) {
            if (i < N)
                System.out.print("1/" + i + " + ");
            else
                System.out.print("1/" + i);
            Nth_harmonic += 1f/i;
        }
        System.out.println();
        System.out.println(Nth_harmonic);
    }
}
