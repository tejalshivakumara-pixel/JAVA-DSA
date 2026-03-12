package Assignment;

import java.util.Scanner;

public class PrimeNum {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        n = sc.nextInt();
        if (n <= 1) {
            System.out.println("Not prime");
        } else {
            for (int i = 2; i < n; i++) {
                if (i % n == 0) {
                    System.out.println("not prime");
                } else {
                    System.out.println("prime");
                }
            }
        }
    }
}

