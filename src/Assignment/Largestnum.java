package Assignment;

import java.util.Scanner;

public class Largestnum {
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter 3 numbers:");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        if( a>b && a>b){
            System.out.println(a + "is greater");
        }
        else if(b>a && b>c){
            System.out.println(b+ "is greater");
        }
        else{
            System.out.println(c+ "is greater");
        }
    }
}
