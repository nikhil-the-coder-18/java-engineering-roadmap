// Create a Class Cylinder and Constuctor to set it radius
// and height and get it's volume.
// Date: 03/01/2025
// Author: Nikhil


class Cylinder2 {
    float radius;
    float height;

    Cylinder2(float r, float h) {
        radius = r;
        height = h;

        System.out.println("Volume: " + (3.14 * Math.pow(radius, 2) * height)); 
    }
}

public class OOP_14_ConstructorCylinder2 {
    public static void main(String[] args) {
        Cylinder2 c = new Cylinder2 (2, 43);
    }
}
