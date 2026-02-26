package OOPS.Basics.Abstraction;

abstract class Food {
    abstract void eat();

}
class Chinese extends Food{
    void eat(){
        System.out.println("Food is spicy");
    }
}
class Italian extends Food{
    void eat(){
        System.out.println("Food is cheesy");
    }
}
class Mexican extends Food{
    void eat(){
        System.out.println("Food is sour");
    }
}
class Main{
    public static void main(String[] args) {
        Chinese c = new Chinese();
        c.eat();
        Italian i = new Italian();
        i.eat();
        Mexican m = new Mexican();
        m.eat();
    }
}
