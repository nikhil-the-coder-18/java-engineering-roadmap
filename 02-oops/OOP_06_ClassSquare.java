import java.util.Scanner;

class Square {
    Scanner ip = new Scanner(System.in);
    float Area;

    public float Area () {
        System.out.println("\nArea Of Square Calculator! ");

        System.out.print("Enter Side A: ");
        float Side = ip.nextFloat();

        return Side*Side;
    }
}

public class OOP_06_ClassSquare {
    public static void main (String[] args) {
        Square s1 = new Square();

        System.out.println("Area of Square is: " + s1.Area() + "\n");
    }
}