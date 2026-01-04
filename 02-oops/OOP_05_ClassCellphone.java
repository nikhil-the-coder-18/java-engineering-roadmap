class CellPhone {
    public static void Ring () {
        System.out.println("Ringing....");
    }

    public static void Vibrate () {
        System.out.println("Virbrating....");
    }
}

public class OOP_05_ClassCellphone {
    public static void main (String[] args) {
        CellPhone Samsung = new CellPhone();
        CellPhone iPhone = new CellPhone();

        Samsung.Ring();
        iPhone.Vibrate();
        
    }
}