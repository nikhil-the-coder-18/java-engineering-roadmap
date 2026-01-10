// WAP to show use of Dynamic Method Dispatch 1.
// Author : Nikhil

class Animal {
    void sound() {
        System.out.println("Animal Makes Sound...");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Bark! Bark!");
    }
}

public class OOP_39_DynamicMethodDispatch1 {
    public static void main(String[] args) {
        Animal tommy = new Dog();   // Allowed
        //  Dog tommy = new Animal(); // Not allowed

        tommy.sound();
    }
}
