import java.util.InputMismatchException;
import java.util.Scanner;

public class Ch12Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 2 ints:");
        while (true) {
            try {
                int n1 = scanner.nextInt();
                int n2 = scanner.nextInt();
                System.out.println(n1+"+"+n2+"="+(n1+n2));
                break;
            } catch (InputMismatchException ex) {
                System.out.println("Int please! Enter Again:");
                scanner.nextLine();
            }
        }

    }
}
