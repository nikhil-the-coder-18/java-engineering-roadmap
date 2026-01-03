public class RecursionFibonacci {
    public static void main(String[] args) {
        System.out.print("Fibonacci Series: ");
        int terms = 10;

        for(int i=0; i<=terms; i++) {
            System.out.print(Fibo(i) + " ");
        }
    }

    public static int Fibo(int n) {
        if(n<=1) {
            return n;
        }

        return Fibo(n-1) + Fibo(n-2);
    }
}
