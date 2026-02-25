package OOPS.Basics.ConstructorDemo;

public class Student {
    String Name;
    int usn;

    //Traditional Constructor!
    Student(String name, int usn) {
        this.Name = name;
        this.usn = usn;
    }

    //copy constructor
    Student(Student obj) {
        this.Name = obj.Name;
        this.usn = obj.usn;
    }
    void display(){
        System.out.println(Name+","+usn);
    }
}
    class Drive {
        static void main(String[] args) {
            Student s1 = new Student("Tejal S", 117);
            Student s2 = new Student(s1);
            s1.display();
            s2.display();
        }
    }

