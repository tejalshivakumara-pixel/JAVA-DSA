package recurssion;

public class SumOfNatural {
    public static void main(String[] args) {
        int num = 10;//starts from 1 until the "num" number ->
        int sum =0;
        for(int i=1;i<=num;i++){
            sum=sum+i;
        }
        System.out.println("Sum is:"+sum);
    }
}
