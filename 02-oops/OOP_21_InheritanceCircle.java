// Create a class Circle and use inheritance to create another class  cylinder from it.

class Circle {
    float radius;

    public void setRadius(int r) {
        radius = r;
    }

    public float area() {
        return (float) (3.14 * radius * radius);
    }
}

class cylinder extends Circle {
    float height;

    public void setHeight (int h) {
        height = h;
    }

    public void volume() {
        System.out.println("Area of Circle: " + area());
        System.out.println("Volume of cylinder: " + (area() * height));
    }
}

public class OOP_21_InheritanceCircle {
    public static void main(String[] args) {
        cylinder c = new cylinder();

        c.setRadius(5);
        c.setHeight(5);

        c.volume();
    }
}
