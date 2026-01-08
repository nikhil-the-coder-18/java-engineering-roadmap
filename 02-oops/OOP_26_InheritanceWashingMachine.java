class Appliance {
    void turnOn() {
        System.out.println("Washing machine on....");
    }

    void turnOff() {
        System.out.println("Washing machine off...");
    }
}

class WashingMachine extends Appliance {
    String Brand;

    void ShowBrand(String Brand) {
        this.Brand = Brand;

        System.out.println("Machine Brand: " + this.Brand);
    }

    void washClothes() {
        System.out.println("Clothes Washing...");
    }
}

public class OOP_26_InheritanceWashingMachine {
    public static void main(String[] args) {
        WashingMachine m1 = new WashingMachine();

        m1.turnOn();
        m1.ShowBrand("Samsung");
        m1.washClothes();
        m1.turnOff();
    }
}
