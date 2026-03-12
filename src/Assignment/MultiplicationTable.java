package Assignment;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        int n;
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        n=sc.nextInt();
        for(i=0;i<=10;i++){
            System.out.println(n*i);
        }
    }
}
