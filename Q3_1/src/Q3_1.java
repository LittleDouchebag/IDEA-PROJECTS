/**
 * Created by SiceLab on 2018/10/9.
 */
import java.util.Scanner

public class Q3_1 {
    public static void main(String[] args) {
        System.out.println("Please Enter a :");
        Scanner scanner = new Scanner(System.in);
        float a = scanner.nextFloat();
        System.out.println("Please Enter b :");
        float b = scanner.nextFloat();
        System.out.println("Please Enter c :");
        float c = scanner.nextFloat();

        float delta = b * b - 4 * a * c;
        if (delta<0)
            System.out.println("The equation has no real roots!");
        else if (delta==0)
        {
            System.out.println("The equation has two same roots!" + "/n" + -b/(2*a));
        }
        else
        {
            System.out.println("The equation has two different roots!");
            System.out.println("The first root is: " + (-b + Math.pow(delta , 0.5))/(2*a) );
            System.out.println("The second root is:" + (-b - Math.pow(delta , 0.5))/(2*a) );
        }
    }
}
