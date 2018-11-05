import java.util.Random;
import java.util.Scanner;

public class GuessNumber{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
//        Book Style
//        int number =(int)(Math.random()*101);
        int number = rand.nextInt(101);
        System.out.println("Guess it?");
        int guess;
        for (;;) {
            guess = scanner.nextInt();
            if (guess>number)
                System.out.println("Your guess is high.");
            if (guess<number)
                System.out.println("Your guess is low");
            if (guess==number) {
                System.out.println("You are right, the number is " + number + ".");
                break;
            }
        }
    }
}