package OOPS.Basics.Inheritance.multilevel;

public class Animal {
    static void eat() {
        System.out.println("Eating");
    }
}
class Lion extends Animal{
    static void roar(){
        System.out.println("roaring");
    }
}
class BabyLion extends Lion{
     static void cry(){
        System.out.println("Crying");
    }
}
class Driver{
public static void main(String[] args) {
    Animal.eat();
    Lion.roar();
    Lion.eat();
    BabyLion.cry();
    BabyLion.eat();
    BabyLion.roar();
}
}