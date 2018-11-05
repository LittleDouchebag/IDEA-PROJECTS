import java.util.Scanner;

public class Ch4Q21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your ID:");
        String ID = scanner.next();
        int flag = 0;
        for (int i = 0; i <= 10; i++) {
            if (i == 3 || i == 6) {
                if (ID.charAt(i) != '-'){
                    System.out.println("Error!");
                    flag = 1;
                    break;
                }
            } else if (ID.charAt(i) > '9' || ID.charAt(i) < '0') {
                System.out.println("Error");
                flag = 1;
                break;
            }
        }
        if (flag == 0)
            System.out.println("your id is valid!");
    }
}
