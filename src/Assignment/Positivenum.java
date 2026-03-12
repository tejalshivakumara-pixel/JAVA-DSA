package Assignment;


import java.util.Scanner;

public class Positivenum {
    static void main(String[] args) {
        int num ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        num = sc.nextInt();
        if(num == 0){
            System.out.println("The number is equal to zero");
        }
        else if (num>=0){
            System.out.println("The number is positive");
        }
        else{
            System.out.println("The number is negative");
        }
    }
}
