package Exception;

public class E3 {
    static void checkAge(int age){
        if (age>=18){
            System.out.println("Eligible");
        }else{
            throw new RuntimeException("not eligible");// we are not handling the error we are
            // intentionally throwing the error
        }
    }
    public static void main(String[] args) {
        checkAge(12);
    }
}
