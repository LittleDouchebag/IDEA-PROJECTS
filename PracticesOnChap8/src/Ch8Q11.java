import java.util.Scanner;

public class Ch8Q11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number between 0 and 511: ");
        int num = scanner.nextInt();
        String coins = "";
        for (int i=0;i<9;i++){
            int compare = 0x100;
            if ((compare & num) ==0){
                coins+='H';
            }
            else
                coins+='T';
            num<<=1;
        }
        char[][] out_matrix = new char[3][3];
        for (int i=0;i<9;i++){
            if (i%3==0 && i!=0)
                System.out.println();
            out_matrix[i/3][i%3]=coins.charAt(i);
            System.out.print(coins.charAt(i));
        }
    }
}