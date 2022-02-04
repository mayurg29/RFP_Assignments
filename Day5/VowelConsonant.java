package com.bridgelabz.Day5;

import java.util.Scanner;

public class VowelConsonant {
    public static void main(String[] args) {
        System.out.println("Enter an Alphabet: ");
        Scanner sc = new Scanner(System.in);
        char Alphabet = sc.next().charAt(0);
        switch (Alphabet) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("Given alphabet is a vowel");
                break;
            default:
                System.out.println("Given alphabet is a consonant");
        }
    }
}
