import java.util.Scanner;

public class Ch8Q20 {
    public static void main(String[] args) {
        int[][] game_board = new int[6][7];
        board_display(game_board);
        for (int turn=1;;) {
            game_board = drop_disk(game_board,turn++);
            board_display(game_board);
            if (board_check(game_board))
                break;
        }
    }
    public static void board_display(int[][] game_board){
        for (int i=0;i<6;i++){
            for (int j=0;j<7;j++){
                if (game_board[i][j]==0)
                    System.out.print("  ");
                else if(game_board[i][j]==1)
                    System.out.print("△");
                else
                    System.out.print("○");
            }
            System.out.println();
        }
    }
    public static int[][] drop_disk(int[][] game_board,int turn){
        Scanner scanner = new Scanner(System.in);
        for (boolean flag=false;flag==false;) {
            if (turn % 2 == 1) {
                System.out.println("Drop a red disk at column(0-6): ");
            } else System.out.println("Drop a yellow disk at column(0-6): ");
            int droprow = scanner.nextInt();
            for (int i = 5; i > -1; i--) {
                if (game_board[i][droprow] == 0) {
                    if (turn % 2 == 1)
                        game_board[i][droprow] = 1;
                    else
                        game_board[i][droprow] = -1;
                    flag=true;
                    break;
                }
            }
            if (flag==false)
                System.out.println("NO SPACE TO DROP,CHOOSE ANOTHER!");
        }
        return game_board;
    }
    public static boolean board_check(int[][] game_board){
        // row check
        for (int i=0;i<6;i++){
            for (int j=0;j<4;j++){
                if (game_board[i][j]+game_board[i][j+1]+game_board[i][j+2]+game_board[i][j+3]==4){
                    System.out.println("RED WON!");
                    return true;
                }
                else if (game_board[i][j]+game_board[i][j+1]+game_board[i][j+2]+game_board[i][j+3]==-4){
                    System.out.println("YELLOW WON!");
                    return true;
                }
                }
        }
        //column check
        for (int i=0;i<3;i++){
            for (int j=0;j<7;j++){
                if (game_board[i][j]+game_board[i+1][j]+game_board[i+2][j]+game_board[i+3][j]==4){
                    System.out.println("RED WON!");
                    return true;
                }
                else if (game_board[i][j]+game_board[i+1][j]+game_board[i+2][j]+game_board[i+3][j]==-4){
                    System.out.println("YELLOW WON!");
                    return true;
                }
            }
        }
        //diag check
        for (int i=0;i<3;i++){
            for (int j=0;j<4;j++){
                if (game_board[i][j]+game_board[i+1][j+1]+game_board[i+2][j+2]+game_board[i+3][j+3]==4){
                    System.out.println("RED WON!");
                    return true;
                }
                else if (game_board[i][j]+game_board[i+1][j+1]+game_board[i+2][j+2]+game_board[i+3][j+3]==-4){
                    System.out.println("YELLOW WON!");
                    return true;
                }
            }
        }
        //sub-diag check
        for (int i=0;i<3;i++){
            for (int j=3;j<7;j++){
                if (game_board[i][j]+game_board[i+1][j-1]+game_board[i+2][j-2]+game_board[i+3][j-3]==4){
                    System.out.println("RED WON!");
                    return true;
                }
                else if (game_board[i][j]+game_board[i+1][j-1]+game_board[i+2][j-2]+game_board[i+3][j-3]==-4){
                    System.out.println("YELLOW WON!");
                    return true;
                }
            }
        }
        //draw check
        boolean flag = true;
        for (int i=0;i<7;i++){
            if (game_board[0][i]==0)
                flag=false;
        }
        if (flag) {
            System.out.println("DRAW!!");
            return true;
        }
        return false;
    }
}
