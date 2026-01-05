// Create a class Animal and Derive another class Dog from it.
// Author : Nikhil

class Animal {
    Animal() {
        System.out.println("He is eating...");
    }
}
class Dog extends Animal {
    Dog() {
        System.out.println("Barking...");
    }
}

public class OOP_20_Inheritance {
    public static void main(String[] args) {
        Dog Tomy = new Dog();
    }
}