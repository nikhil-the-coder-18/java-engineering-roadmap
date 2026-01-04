// Use Constructor to find area of Circle.
// Date: 03/01/2025
// Author: Nikhil


class Circle {
    Circle(float radius) {
        System.out.println("Area = " + (3.14 * radius * radius));
    }
}

public class OOP_15_ConstructorCircle {
    public static void main(String[] args) {
        Circle c = new Circle(5);
    }
}
