package Threads.MainSingleThread.LambdaExpression;
interface Greeting {
    void SayHello();
}
public class Demo {
    public static void main(String[] args) {
        Greeting g = new Greeting(){
            @Override
            public void SayHello(){
                System.out.println("Hello world");
            }
        };
        g.SayHello();
    }
}
