import java.util.Scanner;

public class Ch8Q20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] game_board = new int[6][7];
        for (int turn=1;;) {
            board_display(game_board);
            game_board = drop_disk(game_board,turn++);

            if (board_check(game_board)!=0)
                break;
        }
    }
    public static void board_display(int[][] game_board){
        for (int i=0;i<6;i++){
            for (int j=0;j<7;j++){
                if (game_board[i][j]==0)
                    System.out.print("□");
                else if(game_board[i][j]==1)
                    System.out.print("△");
                else
                    System.out.print("○");
            }
            System.out.println();
        }
    }
    public static int[][] drop_disk(int[][] game_board,int turn){
        return game_board;
    }
    public static int board_check(int[][] game_board){

    }
}
