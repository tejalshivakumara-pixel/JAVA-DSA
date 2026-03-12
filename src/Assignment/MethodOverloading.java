package Assignment;

public class MethodOverloading {
        static int add(int a, int b) {
            return a + b;
        }
        static int add(int a, int b, int c) {
            return a + b + c;
        }
        static double add(double a, double b) {
            return a + b;
        }
        public static void main(String[] args) {
            System.out.println("Addition of 2 integers: " + add(50, 20));
            System.out.println("Addition of 3 integers: " + add(11, 45, 67));
            System.out.println("Addition of 2 doubles: " + add(4.9, 8.7));
        }
    }

