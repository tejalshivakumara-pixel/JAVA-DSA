package looping;

import java.util.Scanner;

public class PatternBow {
    public static void main(String[] args) {
        int size;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size:");
        size = sc.nextInt();
        //upper triangle
        for (int i = 1; i <= size; i++) {
            for (int k = 1; k <= i; k++) {
                System.out.print(" * ");
            }
            for (int j = 2 * i; j < 2 * size; j++) {
                System.out.print("   ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
        //lower triangle
        for (int i = size - 1; i > 0; i--) {
            for (int k = 1; k <= i; k++) {
                System.out.print(" * ");
            }
            for (int j = 2 * i; j < 2 * size; j++) {
                System.out.print("   ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}

