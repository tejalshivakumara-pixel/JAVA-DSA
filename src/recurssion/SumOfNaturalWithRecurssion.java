package recurssion;

public class SumOfNaturalWithRecurssion {
    // recursive  way
    static int sum(int x){
        if(x==1){//base case
            return 1;
        }else{
            return x+sum(x-1);//recursive  case
        }
    }
    public static void main(String[] args) {
        int num =10;
        int result = sum(num);
        System.out.println("sum is:"+sum);
    }
}
// eg : let num=5
// is 5==1? ->false so
// 5+sum(4)   -> this equation is still running but we went inside one function that is sum(4)
// the again is 4==1? -> false
//hence 4+sum(3) -> here also the same thing happens
//3+sum(2)
//2+sum(1)
//now y we use stack function is bcs it stores the pending equation like sum(3) etc..and uses
// lifo method to evaluate
//why base class is needed because it stops the execution at some point of time bcs of which the stack wont overflow and prog wont crash
//usage of loops in prog is called iterative method
