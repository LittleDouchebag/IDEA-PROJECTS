import java.util.Scanner;

public class Ch5Q37 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a decimal integer:");
        int dec = scanner.nextInt(),bin=0,digit =1 ;
        for (; dec !=0;){
            bin = bin + digit * (dec % 2);
            digit *= 10;
            dec = dec / 2;
        }
        System.out.println("Binary is:"+ bin);
    }
}
