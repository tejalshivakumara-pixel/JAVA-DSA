package Exception;

public class E2 {
    public static void main(String[] args) {
        int i , j , k = 0;
        i=10;
        j=0;
        try{
            k=i/j;
            int[] arr = {1,2,3,4,5};
            System.out.println(arr[10]);
            System.out.println(k);
        }catch(ArithmeticException | ArrayIndexOutOfBoundsException e){ //syntax for multiple exception
            System.out.println(e);
        }
    }
}
