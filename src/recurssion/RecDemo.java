package recurssion;

public class RecDemo {
    static void function() {
        System.out.println("hello");
        function();//function calls itself
    }
        public static void main(String[] args) {
        function();
    }
}
//this catches an exception but stops after ssometime
//why it stops? -> beacuse of function stack
//the stack side of memory gets full and overflows bcs of which it crashes and throws an exception
//how do we control recurssion?
//by using base case and recursive case
//base case -> stop the program
//recursive case -> keep calling itseld again and again
//anywhere we use loop we can use recursion also
