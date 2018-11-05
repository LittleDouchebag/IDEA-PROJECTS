import java.util.Random;
import java.util.Scanner;

public class mathquiz {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        int grade = 0;
        int temp, num_a, num_b, answer;
        long startTime = System.currentTimeMillis();
        for (int count = 1; count <= 5; count++) {
            num_a = rand.nextInt(10);
            num_b = rand.nextInt(10);
            if (num_a < num_b) {
                temp = num_a;
                num_a = num_b;
                num_b = temp;
            }
            System.out.println("What is " + num_a + " - " + num_b + " ?");
            answer = scanner.nextInt();
            if (answer != (num_a - num_b))
                System.out.println("You're wrong, the correct answer is:" + num_a + " - " + num_b + " = " + (num_a - num_b));
            else{
                System.out.println("Oh you're clever aren't you little rat.");
                grade++;
            }
        }
        System.out.println("Correct count is " + grade +".");
        long endTime = System.currentTimeMillis();
        System.out.println("You spent "+ ((endTime-startTime)/1000)+" seconds in total.");
    }
}
