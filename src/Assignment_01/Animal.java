package Assignment_01;

class Animal {
    static void eat() {
        System.out.println("Animal is eating");
    }

    class Dog extends Animal {
        static void cry() {
            System.out.println("Animal is barking");
        }
    }

    public static void main(String[] args) {
        Animal.eat();
        Dog.cry();
    }
}
