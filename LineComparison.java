package com.bridgelabz.dayone;

import java.util.Scanner;

public class LineComparison {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        Integer i1 = read.nextInt();
        Integer i2 = read.nextInt();
        System.out.println("i1 = " + i1);
        System.out.println("i2 = " + i2);
        System.out.println("compare output = " + i1.compareTo(i2));
    }
}
