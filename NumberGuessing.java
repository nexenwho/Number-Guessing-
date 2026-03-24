import java.util.Random;
import java.util.Scanner;
public class NumberGuessing {
    public static void main(String[] args) {

        Random k = new Random();
        Scanner k2 = new Scanner(System.in);
        int secretnumber = k.nextInt(100) + 1;
        System.out.println("heyy guess a number between 1 to 100 and lets see if it matches mine");
        int userNum = k2.nextInt();
        while (userNum != secretnumber) {
            if (userNum > secretnumber) {
                System.out.println("uhh u guessed higher, but u can always try again");
            } else {
                System.out.println("uhh u guess lower, but u can always try again");
            }
            userNum = k2.nextInt();
        }
        System.out.println("Yay! our number matched!");
    }
}