// Print a series of numbers with recursive Java methods.

public class RecursionNumberSeries {
    public static void main(String[] args) {
        Series(5);
    }

    public static void Series(int n) {
        if(n==0) {
            return;
        }

        Series(n-1);

        System.out.println(n);
    }
}
