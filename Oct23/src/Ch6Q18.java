import java.util.Scanner;

public class Ch6Q18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Password!");
        String input = scanner.next();
        int num_count=0,flag=0;
        if (input.length()<8) {
            System.out.println("invalid length!");
            flag= 1;
        }
        for (int i=0;i<input.length();i++){
            if (input.charAt(i)>='0' && input.charAt(i)<='9' )
                num_count++;
            else if ((input.charAt(i)>='a' && input.charAt(i)<='z')||(input.charAt(i)>='A' && input.charAt(i)<='Z')){
                continue;
            }
            else{
                System.out.println("invalid character!");
                flag = 1;
                break;
            }
        }
        if (num_count<2 && flag == 0)
            System.out.println("invalid number of numbers");
        else if (flag == 0)
            System.out.println("valid");
    }
}
