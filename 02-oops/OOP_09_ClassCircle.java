import java.util.Scanner;

class Circle {
    float Height;
    float Width;

    public double Area(int R) {
        return R * R * 3.14;
    }
}

public class OOP_09_ClassCircle {
    public static void main(String[] args) {
        Circle c = new Circle();

        System.out.println(c.Area(10));
    }
}