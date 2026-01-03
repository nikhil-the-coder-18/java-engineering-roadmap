public class RecursionCountDigits {
    public static void main(String[] args) {
        System.out.println(sum(505));
    }

    public static int sum(int n) {
        if(n==0) {
            return n;
        }

        return 1 + sum(n/10);
    }
}
