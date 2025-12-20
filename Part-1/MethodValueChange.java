public class MethodValueChange {
    public static void main (String[] args) {
        int[] arr={10, 20, 30};
        System.out.println("Before Function: " + arr[0]);
        change(arr);
        System.out.println("After Function: " + arr[0]);
    }

    public static void change(int[] arr) {
        arr[0] = 99;
    }
}