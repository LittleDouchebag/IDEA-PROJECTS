import java.util.Scanner;

public class SentinelValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the numbers to be added:");
        int sum=0,current=scanner.nextInt();
        while (current!=0) {
            sum += current;
            current = scanner.nextInt();
        }
        System.out.println("The sum is: "+ sum);
    }
}
