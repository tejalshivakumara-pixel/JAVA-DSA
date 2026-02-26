package OOPS.Basics.Abstraction.Upcasting;

public interface Vehicle {
    void move();
}
class Car implements Vehicle{
    public void move(){
        System.out.println("Car is moving");
    }
}
class Bike implements Vehicle{
    public void move(){
        System.out.println("Bike is moving");
    }
}
class Driver{
    public static void main(String[] args) {
        Vehicle v1= new Car(); // v1 points to car
        v1.move();
        Vehicle v2= new Bike(); // v2 points to bike
        v2.move();
    }
}

