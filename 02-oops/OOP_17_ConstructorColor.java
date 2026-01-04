class Car {
    String color;
    Car(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}

public class OOP_17_ConstructorColor {
    public static void main(String[] args) {
        Car BMW = new Car("Blue");

        System.out.println(BMW.getColor());
    }
}
