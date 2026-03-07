package Threads.MainSingleThread.LambdaExpression;
interface Greeting2{
    void SayHello();
}
public class Driver {
    public static void main(String[] args) {
        Greeting2 g = () -> { // () represents parameters of that function
            System.out.println("Hello world");
        };
        g.SayHello();
    }
    }
