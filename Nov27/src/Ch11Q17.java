import java.util.Scanner;

public class Ch11Q17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an int:");
        int m = scanner.nextInt(),top=0;
        int[] list = new int[100];
        for (int temp=m;temp!=1;){
            for (int i=2;i<=temp;i++){
                if (temp%i==0){
                    temp/=i;
                    list[top++]=i;
                    break;
                }
            }
        }
        for (int i=0;i<-top;i++)
            System.out.print(list[i]+"\t");
        System.out.println();
//        现在是找n时间。。。
        int zhizhen=0;
        int[][] count_array=new int[2][100];
        count_array[0][0]=list[0];
        count_array[1][0]=1;
        for (int i=1;i<top;i++){
            if (list[zhizhen]==list[i]){
                count_array[1][zhizhen]++;
            }
            else{
                count_array[1][++zhizhen]++;
                count_array[0][zhizhen]=list[i];
            }
        }
        for (int i=0;i<2;i++){
            for (int j=0;count_array[0][j]!=0;j++){
                System.out.print(count_array[i][j]+"\t");
            }
            System.out.println();
        }
        int n=1;
        for (int i=0;count_array[0][i]!=0;i++){
            if (count_array[1][i]%2!=0)
                n*=count_array[0][i];
        }
        System.out.println("The smallest number n for m*n to be a perfect square is "+n);
        System.out.println("m * n is "+m*n);
    }
}
