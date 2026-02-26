package OOPS.Basics.Abstraction.AccessDefaultMethods;

import javax.swing.plaf.synth.SynthTextAreaUI;

public interface Vehicle {
    void start();
    default void stop(){
        System.out.println("Engine stopped");
    }
}
class Audi implements Vehicle{
    public void start(){
        System.out.println("Audi has started");
    }
}
class BMW implements Vehicle{
    public void start(){
        System.out.println("bmw has started");
    }
}
class Porsche implements Vehicle{
    public void start(){
        System.out.println("Porsche has started");
    }
}
class Bike implements Vehicle{
    public void start(){
        System.out.println("Bike");
    }
}
class Main{
    public static void main(String[] args) {
        Audi a = new Audi();
        a.stop(); //1st way to
        a.start();
        Vehicle v = new BMW();
        v.stop();
        v.start();
        Bike b = new Bike();
        b.stop();
        b.start();
    }
}
