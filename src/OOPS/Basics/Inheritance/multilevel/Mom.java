package OOPS.Basics.Inheritance.multilevel;

interface Mom {
    default void cook(){
        System.out.println("Mom cooks Indian");
    }
}

interface Dad{
   default void cook(){
        System.out.println("Dad cooks Chinese");
    }
}
class Child implements Mom,Dad{
    public void cook() {
        //System.out.println("Indian"); //this is the first method
        Mom.super.cook();           //this is second method
    }
}
class Demo{
    public static void main(String[] args) {
        Child c = new Child();
        c.cook();
    }
}
