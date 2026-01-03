import java.util.Scanner;

public class ReverseString  {

    public static void main (String[] args) {
        Scanner ip = new Scanner(System.in);

        System.out.print("Enter String: ");
        String nothing = ip.next();

        String Reverse = Reverseit(nothing);

        System.out.println("Reversed String: " + Reverse);
    }

    public static String Reverseit (String temp) {
        String Reversed = " ";

        for(int i=0; i<temp.length(); i++) {
            char rv = temp.charAt(i);
            Reversed = rv + Reversed;
        }

        return Reversed;
    }
}