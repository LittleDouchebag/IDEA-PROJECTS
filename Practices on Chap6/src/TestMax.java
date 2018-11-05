import java.util.Scanner;

public class TestMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 2 numbers:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = max(a, b);

        System.out.println("The bigger one between " + a + " and " + b + " is " + c);
    }


    public static int max(int a, int b) {
        int result;

        if (a > b)
            result = a;
        else
            result = b;
        return result;
    }
}