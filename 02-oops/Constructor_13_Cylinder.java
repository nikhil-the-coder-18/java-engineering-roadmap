// Create a Class Cylinder and use getters and setters
// to set it radius and height and get it's volume.
// Date: 03/01/2025
// Author: Nikhil

class Cylinder {
    float height;
    float radius;

    public void setHeight (float h) {
        height = h;
    }

    public void setRadius (float r) {
        radius = r;
    }

    public float getHeight() {
        return height;
    }

    public float getRadius() {
        return radius;
    }
}

public class Constructor_13_Cylinder {
    public static void main(String[] args) {
        
        Cylinder c = new Cylinder();

        c.setHeight(43);
        c.setRadius(2);

        System.out.println("volume of cylinder is: " + (3.14 * (Math.pow(c.getRadius(), 2)) * c.getHeight()));
    }
}
