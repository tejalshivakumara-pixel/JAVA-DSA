package OOPS.Basics.Abstraction.Static;

abstract class StaticDemo {
    static void info(){
        System.out.println("Animal are living beings");
    }
    abstract void sound();
}
class Dog extends StaticDemo{
    void sound(){
        System.out.println("Dogs are barking");
    }
}
class Driver{
    public static void main(String[] args) {
        StaticDemo.info();
        Dog d = new Dog();
        d.sound();
    }
}