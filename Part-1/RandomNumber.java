import java.util.Random;
import java.lang.Math;
public class RandomNumber {
    public static void main (String[] args){

        // Genarates Number Bewtween 1 to 10;
        Random rand = new Random();
        int random = rand.nextInt(10) + 1;
        System.out.println(random);


       // using math class
        int RandomNum =(int) (Math.random() * 10);
        System.out.println(RandomNum);
    }
}