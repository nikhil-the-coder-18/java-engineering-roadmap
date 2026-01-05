// Create a class Circle and use inheritance to create another class  cylinder from it.

class Rectangle {
    float length;
    float breadth;

    public void setLength(int l, int b) {
        length = l;
        breadth = b;
    }

    public float area() {
        return (float) (length * breadth);
    }
}

class Cuboid extends Rectangle {
    float height;

    public void setHeight (int h) {
        height = h;
    }

    public void volume() {
        System.out.println("Area of Rectangle: " + area());
        System.out.println("Volume of Cuboid: " + (area() * height));
    }
}

public class OOP_22_InheritanceRectangle {
    public static void main(String[] args) {
        Cuboid c = new Cuboid();

        c.setLength(5, 10);
        c.setHeight(5);

        c.volume();
    }
}
