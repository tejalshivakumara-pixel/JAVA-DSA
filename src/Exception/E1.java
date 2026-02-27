package Exception;

public class E1 {
    public static void main(String[] args) {
    int j, k, i = 0;
    j=10;
    k=0;
    try
    {
        i = j / k;
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(arr[10]);
    } catch(ArithmeticException e) {
        System.out.println("Undefined");
    }catch(ArrayIndexOutOfBoundsException e) {
        System.out.println("Invalid Index");
    }finally {
        System.out.println("this will execute no matter what!");
    }
}
static{
    System.out.println("hi this is me");
}
}
//static is not part of exception handling .it is class loading concept
// before the main method runs the static block runs
//doesnt come inside the main function