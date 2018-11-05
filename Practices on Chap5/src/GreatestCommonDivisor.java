import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        System.out.println("Please enter two integers, the first is:");
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        System.out.println("The second is:");
        int n2 = scanner.nextInt();
        int GCD = 1;
        for (int i = 2; i <= n1 && i <= n2; i++) {
            if (n1 % i == 0 && n2 % i == 0)
                GCD = i;
        }
        System.out.println("The Greatest Common Divisor is " + GCD + ".");
    }
}
