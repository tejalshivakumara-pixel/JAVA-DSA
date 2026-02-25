package OOPS.Basics;

public class Car {
    String Brandname;
    int ManuDate;
    String Color;

    public Car(String Brandname, int MDate, String C){
       this.Brandname=Brandname;
       ManuDate=MDate;
       Color=C;
    }
    public void printDetails(){
        System.out.printf("Car Brandname is %s\n",this.Brandname);
        System.out.printf("Car ManuDate is %d\n",ManuDate);
        System.out.printf("Car Color is %s\n",Color);
    }
}
class Main {
    public static void main(String[] args) {
        Car c1=new Car("Audi",2000,"Cherry red");
        c1.printDetails();
    }
}