import java.util.Scanner;

public class Ch10Q7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Account[] accounts = new Account[10];
        for (int i=0;i<10;i++){
            accounts[i].ID=i;
        }
        for (;;){
            System.out.println("Enter an ID:");
            int inputID = scanner.nextInt();
            if (inputID<0 || inputID>9)
                continue;
            System.out.println("Main Menu\n" +
                    "1:Check balance\n" +
                    "2:Withdraw\n" +
                    "3:Deposit\n" +
                    "4:Exit");
            int Order = scanner.nextInt();
        }
    }
}

class Account{
    int ID;
    double balance = 100;

}