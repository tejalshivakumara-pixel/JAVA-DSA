package com.java.basics;

import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Marks in subject 1:");
        int s1 = sc.nextInt();
        System.out.println("Marks in subject 2:");
        int s2 = sc.nextInt();
        System.out.println("Marks in subject 3:");
        int s3 = sc.nextInt();
        System.out.println("Marks in subject 4:");
        int s4 = sc.nextInt();
        System.out.println("Marks in subject 5:");
        int s5 = sc.nextInt();
        int totalmarks = s1 + s2 + s3 + s4+ s5;
        int percentage = totalmarks / 500 * 100;
        if (percentage >= 75) {
            System.out.println(" Grade A");
        } else if (percentage >= 50) {
            System.out.println(" Grade B");
        } else if (percentage <= 30) {
            System.out.println(" Grade C");
        } else {
            System.out.println(" Fail");
        }
    }
}