
import java.util.Scanner;
public class Ch6Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Plz enter a integer:");
        int n = scanner.nextInt();
        System.out.println(sumDigit(n));
    }
    public static int sumDigit(int n){
        int sum=0;
        for(int temp=n;n!=0;n=n/10){
            sum+=n%10;
        }
        return sum;
    }
}
