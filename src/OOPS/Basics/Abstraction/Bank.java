package OOPS.Basics.Abstraction;

abstract class Bank {
    String branch;
    Bank (String branch){
        this.branch=branch;
    }
    abstract void calculateInterest();
}
class HDFC extends Bank{
    HDFC(String branch){
        super(branch); //calls from parent branch
    }
    void calculateInterest(){
        System.out.println("Interest is 10%");
        System.out.println("Branch is "+branch);
    }
    }
class Demo{
    public static void main(String[] args) {
        HDFC obj = new HDFC("Bel road");
        obj.calculateInterest();

    }
}
