class Device {
    void powerOn() {
        System.out.println("Device Booting....");
    }

    void powerOff() {
        System.out.println("Device Switch Off...");
    }
}

class Mobile extends  Device {
    int no;
    String msg;

    void call (int no) {
        this.no = no;

        System.out.println("Calling to " + no);
    }

    void message (String msg) {
        this.msg = msg;

        System.out.println("Messege \"" + msg + "\" Sent!");
    }
}

public class OOP_25_InheritanceMobile {
    public static void main(String[] args) {
        Mobile iPhone = new Mobile();

        iPhone.powerOn();
        iPhone.call(85111);
        iPhone.message("Hello Nikhil");
        iPhone.powerOff();
    }
}
