public class RecursionSumofN {
    public static void main(String[] args) {
        System.out.println(Sum(5));
    }

    public static int Sum(int no) {
        if(no == 0) {
            return 0;
        }
        return no + Sum(no-1);
    }
}
