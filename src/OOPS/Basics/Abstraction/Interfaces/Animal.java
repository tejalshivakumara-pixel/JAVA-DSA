package OOPS.Basics.Abstraction.Interfaces;

public interface Animal {
    void sound(); // abstract method
    void run();
}
class Dog implements Animal{
    public void sound(){
        System.out.println("Bark");
    }
    public void run(){
        System.out.println("running");
    }
}
class Main{
    public static void main(String[] args) {
        Dog d = new Dog();
        d.run();
        d.sound();
    }
}