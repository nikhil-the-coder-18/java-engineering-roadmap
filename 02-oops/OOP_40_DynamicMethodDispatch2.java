// WAP to show use of Dynamic Method Dispatch 2.
// Author : Nikhil

import javax.swing.text.StyleContext;

class Phone {
    void On() {
        System.out.println("Phone is booting...");
    }
}

class smartPhone extends Phone {
    @Override
    void On() {
        System.out.println("SmartPhone is Booting...");
    }
}

public class OOP_40_DynamicMethodDispatch2 {
    public static void main(String[] args) {

        Phone samsung = new smartPhone();   // Allowed
        // smartPhone samsung = new Phone();   // Not allowed

        samsung.On();
    }
}
