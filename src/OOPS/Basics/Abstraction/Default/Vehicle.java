package OOPS.Basics.Abstraction.Default;

public interface Vehicle {
    void start(); //abstract method
    default void stop(){
        System.out.println("ENGINE STOPPED");
    }
}
class Audi implements Vehicle{
    public void start(){
        System.out.println("Audi has started");
    }
}
class BMW implements Vehicle{
    public void start(){
        System.out.println("BMW has started");
    }
}
class Porsche implements Vehicle{
    public void start(){
        System.out.println("Porsche has started");
    }
}
class Driver{
    public static void main(String[] args) {
        Audi a = new Audi();
        a.start();
        a.stop();

    }
}

