package OOPS.Basics.Abstraction.Interfaces.Notabstract;
//why interfaces are not 100% abstract
public interface Demo {
    void show();//abstract

    default void display() {
        System.out.println("Default message");
    }

    static void message() {
        System.out.println("This is a message");
    }
}

    class ChildDemo implements Demo {
        public void show() {
            System.out.println("inheritance demo");
        }
    }

    class Driver {
        public static void main(String[] args) {
            Demo.message();
            ChildDemo c = new ChildDemo();
            c.show();
        }
    }
