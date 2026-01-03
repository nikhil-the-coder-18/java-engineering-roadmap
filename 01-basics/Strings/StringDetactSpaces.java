public class StringDetactSpaces {
    public static void main(String[] args) {
        String text = "Good morning everyone, my name is Nikhil...";

        if(text.contains("  ") || text.contains("   ")) {
            System.out.println("This text contains double or triple spaces...");
        } else {
            System.out.println("This text does not contains double or triple spaces...");
        }
    }
}
