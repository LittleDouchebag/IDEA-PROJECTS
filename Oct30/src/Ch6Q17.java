import java.util.Scanner;

public class Ch6Q17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Print(n);
    }

    public static void Print(int n){
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                System.out.print("\t"+(int)(Math.random()*2));
            }
            System.out.println();
        }
    }
}
