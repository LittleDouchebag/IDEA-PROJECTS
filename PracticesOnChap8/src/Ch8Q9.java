import java.util.Scanner;

public class Ch8Q9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] game_board = new int[3][3];
        int turn = 1;
        boolean flag=false;
        for (;;){

            for (int i=0;i<3;i++) {
                for (int j=0;j<3;j++) {
                    if (game_board[i][j]==0)
                        System.out.print("□");
                    else if (game_board[i][j]==1)
                        System.out.print("×");
                    else
                        System.out.print("○");
                }
                System.out.println();
            }
            if (flag){
                return;
            }
            if (turn++%2==1) {
                for (;;) {
                    System.out.println("Enter a row(0, 1, or 2)for player X:");
                    int x = scanner.nextInt();
                    System.out.println("Enter a column(0, 1, or 2)for player X:");
                    int y = scanner.nextInt();
                    if (game_board[x][y]==0) {
                        game_board[x][y] = 1;
                        break;
                    }
                    System.out.println("The place is already taken! Enter Again");
                }
            }
            else {
                for (; ; ) {
                    System.out.println("Enter a row(0, 1, or 2)for player Y:");
                    int x = scanner.nextInt();
                    System.out.println("Enter a column(0, 1, or 2)for player Y:");
                    int y = scanner.nextInt();
                    if (game_board[x][y] == 0) {
                        game_board[x][y] = -1;
                        break;
                    }
                    System.out.println("The place is already taken! Enter Again");
                }
            }
            for (int i=0,sum_cross=0,sum_reversecross=0;i<3;i++){
                for (int j=0,sum_row=0,sum_column=0;j<3;j++){
                    sum_row += game_board[i][j];
                    sum_column += game_board[j][i];
                    if (sum_column==3 || sum_row==3){
                        System.out.println("X win!");
                        flag = true;
                    }
                    if (sum_column==-3 || sum_row==-3) {
                        System.out.println("Y win!");
                        flag = true;
                    }
                }
                sum_cross+=game_board[i][i];
                sum_reversecross+=game_board[2-i][i];
                if (sum_cross==3 || sum_reversecross==3){
                    System.out.println("X win!");
                    flag = true;
                }
                if (sum_cross==-3 || sum_reversecross==-3) {
                    System.out.println("Y win!");
                    flag = true;
                }
            }
        }
    }
}
