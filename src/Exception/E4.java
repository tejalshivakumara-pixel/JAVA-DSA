package Exception;

public class E4 {
    public static void main(String[] args) {
        try {
            int balance = 2000;
            int withdraw = 3000;
            if (withdraw > balance) {
                throw new ArithmeticException("insufficient balance");
            }
            System.out.println("withdrawal succesfull");
        }catch(ArithmeticException e){
            System.out.println("Exception caught:"+e.getMessage());
        }
    }
}
