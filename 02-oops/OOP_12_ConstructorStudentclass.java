// WAP to use Constructor.
// Date: 03/01/2025
// Author: Nikhil

class Student1 {
    String name;
    int age;

    Student1(String name, int age) {
        this.name = name;
        this.age = age;

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class OOP_12_ConstructorStudentclass {
    public static void main(String[] args) {

        Student1 s1 = new Student1("Nikhil", 17);
        
    }
}
