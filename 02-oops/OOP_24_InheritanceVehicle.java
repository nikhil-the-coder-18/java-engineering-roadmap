class Vehicle {
    int speed = 250;
    int fuel = 7;
}

class car extends  Vehicle {
    int door = 2;
    String cartype = "Lamborgini";

    car() {
        System.out.println("Car Name: " + cartype);
        System.out.println("Car Top Speed: " + speed);
        System.out.println("Car Total Doors: " + door);
        System.out.println("Feul Available: " + fuel + " Liters");
    }
}

public class OOP_24_InheritanceVehicle {
    public static void main(String[] args) {
        car c1 = new car();
    }
}
