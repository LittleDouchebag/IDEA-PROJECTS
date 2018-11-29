import java.util.InputMismatchException;
import java.util.Scanner;
import java.lang.Throwable;
public class tryNcatchTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hey enter two numbers:");
        try {
//           在try里面定义的只能在try里用，不管对不对
            int a = scanner.nextInt();
            int b = scanner.nextInt();
        }
        catch (InputMismatchException ex){
            System.out.println("I guess you are stupid");
        }
        int a=0,b=0;
        try {
            double c = a/b;
            System.out.println(c);
        }
        catch (ArithmeticException ex){
            System.out.println("Are you stupid?");
//            ex.printStackTrace();
//            System.out.println(ex.toString());
//            ex.printStackTrace();
//            System.out.println("\n" + ex.getMessage());
//            System.out.println("\n" + ex.toString());
        }
    }
}
