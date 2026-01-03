public class RecursionExample {
    public static void main(String[] args) {
        Print();
    }

    public static void Print() {
        System.out.println("Nikhil");
        Print(); // infinity
    }
}
