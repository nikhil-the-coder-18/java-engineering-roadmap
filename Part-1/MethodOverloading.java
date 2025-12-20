public class MethodOverloading {
    public static void main(String[] args) {
        int a=10;
        foor();
        foor(a);
        foor(a, 20);
    }

    public static void foor() {
        System.out.println("Hello Guys");
    }

    public static void foor(int a) {
        System.out.println("Hello Guys " + a + " kaise ho!");
    }

    public static void foor(int a, int b) {
        System.out.println("Hello Guys " + a + " Brother " + b + " Kya hal chal!");
    }
}