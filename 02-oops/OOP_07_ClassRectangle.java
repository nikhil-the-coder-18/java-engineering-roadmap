class Rectangle {
    float Height;
    float Width;

    public float AreaofR(float H, float W) {
        Height = H;
        Width = W;

        return Height*Width;
    }
}

public class OOP_07_ClassRectangle {
    public static void main(String[] args) {
        Rectangle R1 = new Rectangle();

        System.out.println("Area of Rectangle is = " + R1.AreaofR(10, 20));
    }
}