import java.security.InvalidKeyException;
import java.util.Scanner;

public class ExceptionTest {
    public static void main(String[] args) {
        System.out.println("Enter!");
        Scanner scanner = new Scanner(System.in);
        int flag=1;
        while (true) {
            try {
                CircleWithException circle = new CircleWithException(scanner.nextDouble());
                break;
            }
            catch (InvalidRadiusException ex) {
                ex.printStackTrace();
                System.out.println("You'll have to enter a positive number!");
            }
            finally {
                System.out.println("lap's over.");
            }
        }
        System.out.println(flag+"-------");
        try {
            ErrorTest();
        }
        catch (IllegalArgumentException ex){
            ex.printStackTrace();
        }
    }
    static void ErrorTest(){
        try {
            ErrorTest2();
        }
        catch (IllegalArgumentException ex){
            throw new IllegalArgumentException("Yo,man",ex);
        }
    }
    static void ErrorTest2() throws IllegalArgumentException{
        throw new IllegalArgumentException("Jesus");
    }
}
class CircleWithException{
    private double radius;
    public CircleWithException() throws InvalidRadiusException{
        this(1);
    }
    public CircleWithException(double radius) throws InvalidRadiusException{
//        throw IllegalArgumentException{
            if (radius>0)
                this.radius=radius;
            else
                throw new InvalidRadiusException(radius);
//                throw new IllegalArgumentException("Man radius cannot be negative!");
//        }
    }
}
//  Exception Diy
class InvalidRadiusException extends Exception{
    public InvalidRadiusException(double Radius){
        super("Invalid radius "+Radius);
    }
}
