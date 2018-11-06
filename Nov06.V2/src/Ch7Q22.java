public class Ch7Q22 {
    public static void main(String[] args) {
        int[][] qipan = new int[8][8];
        qipan[0][0] = 1;
        /** 一共8个棋子，至少一行有一个棋子 */
        for (int i=1;i<8;i++){
            boolean flag= true;
            /** 每一个棋子对应的列扫描*/
            for (int j=0;j<8;j++){
                if (qipan[i][j]==-1) {
                    qipan[i][j] = 0;
                    continue;
                }
                else if (pos_check(i,j,qipan)) {
                    qipan[i][j] = 1;
                    flag = false;                   // 当前行已经找到
                    break;
                }
            }
            if (flag){
                i = i - 2;
                qipan[i+1][last_scan(i+1,qipan)]=-1;
            }
        }

        print(qipan);

    }
    public static boolean pos_check(int j,int k,int[][] qipan){
        int flag = 0;

        for (int a=0;a<8;a++){
            if (qipan[j][a]==1){
                return false;
            }
            if (qipan[a][k]==1)
                return false;
        }
        for (int a=j+1,b=k+1;a<8&&b<8;a++,b++) {
            if (qipan[a][b] == 1) {
                return false;
            }
        }
        for (int a=j+1,b=k-1;a<8&&b>=0;a++,b--){
            if (qipan[a][b] == 1) {
                return false;
            }
        }
        for (int a=j-1,b=k+1;a>=0&&b<8;a--,b++){
            if (qipan[a][b] == 1) {
                return false;
            }
        }
        for (int a=j-1,b=k-1;a>=0&&b>=0;a--,b--){
            if (qipan[a][b] == 1) {
                return false;
            }
        }
        return true;
    }
    public static void print(int[][] qipan){
        for (int i=0;i<8;i++){
            for (int j=0;j<8;j++){
                if (qipan[i][j]==1)
                    System.out.print("△");
                else
                    System.out.print("囗");
            }
            System.out.println();
        }
    }
    public static int last_scan(int row,int[][] qipan){
        for (int j=0;j<8;j++)
            if (qipan[row][j]==1)
                return j;
            return 0;
    }
}
