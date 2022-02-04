package com.bridgelabz.Day5;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args){
        System.out.println("Enter a year: ");
        Scanner sc = new Scanner(System.in);
        int Year = sc.nextInt();
        if (Year % 4 == 0)
            System.out.println(Year + " " + "is a Leap Year");
        else
            System.out.println(Year + " " + "is not a Leap Year");
    }
}
