package OOPS.Basics.Inheritance;

public class Animal {
    void eat(){
        System.out.println("Eating");
    }
}
class Lion extends Animal{
    void roar(){
        System.out.println("roaring");
    }
}
class Driver{
    public static void main(String[] args) {
        Animal a= new Animal();
        a.eat();
        Lion l = new Lion();
        l.roar();
        l.eat();

    }
}