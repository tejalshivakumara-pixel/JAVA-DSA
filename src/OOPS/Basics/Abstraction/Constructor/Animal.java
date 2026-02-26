package OOPS.Basics.Abstraction.Constructor;

abstract class Animal {
    //default constructor ->
    Animal(){
        System.out.println("Animal Constructor");
    }
    abstract void sound();
}
class Dog extends Animal{
    Dog(){
        System.out.println("Dog constructtor");
    }
    void sound(){
        System.out.println("Dog barks");

    }
}
class Main{
    public static void main(String[] args) {
      Dog d = new Dog();//Dog() here is the constructor call
      d.sound();
    }
}
/* why does abstarct classes have constructor?
constructors are used to initialise the common data!
when a child class object is created , the parent class constructor runs first
parent constructor is getting executed bcs of inheritance not because of object creation
 */
