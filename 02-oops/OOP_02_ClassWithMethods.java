// WAP to Create an Class With Method
// Date: 01/01/2026
// Author: Nikhil

class Pen {
    String color;
    String type;    // gel or ballpoint

    public static void write() {
        System.out.println("I am Writing....");
    }
}

public class OOP_02_ClassWithMethods {
    public static void main(String[] args) {
        Pen p1 = new Pen();

        p1.color = "Blue";
        p1.type = "gel";

        p1.write();
    }
}
