import java.util.Scanner;
public class Ch8Q14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter the size for the matrix: >");
        int num = scanner.nextInt();
        int[][] matrix = new int[num][num];
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                matrix[i][j] = (int) (Math.random() * 2);
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }

        for (int i = 0,diag=0,sub_diag=0; i < num; i++) {
            for (int j = 0,row=0,column=0; j < num; j++) {
                row += matrix[i][j];
                column += matrix[j][i];
                if (row==num)
                    System.out.println("All 1s on row "+ i);
                if (column==num)
                    System.out.println("All 1s on column "+ i);
                if (row==0 && j==num-1)
                    System.out.println("All 0s on row "+ i);
                if (column==0 && j==num-1)
                    System.out.println("All 1s on column "+i);
            }
            diag += matrix[i][i];
            sub_diag += matrix[i][num-1-i];
            if (diag==num)
                System.out.println("All 1s on diag ");
            if (sub_diag==num)
                System.out.println("All 1s on sub-diag ");
            if (diag==0 && i==num-1)
                System.out.println("All 0s on diag ");
            if (sub_diag==0 && i==num-1)
                System.out.println("All 0s on sub-diag ");
        }
    }
}


