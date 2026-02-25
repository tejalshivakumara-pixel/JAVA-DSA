package OOPS.Basics.Encapsulation;

public class Student {
    String name;
    int usn;

    Student(String name,int usn){
        this.name=name;
        this.usn=usn;
    }
    String getName(){
        return this.name;
    }
    void SetName(String name){
        this.name=name;
    }
    int getUSN(){
        return this.usn;
    }
    void setUSN(int usn){
        this.usn=usn;
    }
    void printDetails(){
        System.out.println("Student name is:"+this.name);
        System.out.println("Student usn is:"+this.usn);
    }
}
class Driver{
    public static void main(String[] args) {
        Student s1=new Student("Tejal S",123);
        s1.printDetails();
        System.out.println("Name is "+s1.getName());
        s1.SetName("David");
        s1.printDetails();
    }
}
