package Assignment;

public class Student {
        int usn;
        String name;
        Student() {
            usn = 0;
            name = " ";
        }
        Student(int usn , String name) {
            this.usn = usn;
            this.name = name;
        }
        void display() {
            System.out.println("USN: " + this.usn);
            System.out.println("Name   : " + this.name);
            System.out.println();
        }
        public static void main(String[] args) {
            Student s1 = new Student();
            Student s2 = new Student(117, "Amaira");
            s1.display();
            s2.display();
        }
    }

