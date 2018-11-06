/**
 * Created by SiceLab on 2018/10/9. 013031997
 */
import java.util.Scanner;

public class Q3_9 {
    public static void main(String[] args) {
        System.out.println("Please Enter The First 9 digits as integer:");
        Scanner scanner = new Scanner(System.in);
        int f9d = scanner.nextInt();
        System.out.println();
        int temp = f9d;
        int total = 0;
        for (int i = 9; i > 0; i--) {
            total = total + temp % 10 * i;
            temp = temp / 10;
        }
        int d10;
        d10 = total % 11;
        if (d10==10)
            System.out.println("The Whole Serial is: " + f9d + "X");
        else
            System.out.println("The Whole Serial is: " + f9d + "" + d10);
    }
}