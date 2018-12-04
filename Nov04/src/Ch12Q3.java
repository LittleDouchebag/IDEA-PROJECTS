import java.util.Scanner;

public class Ch12Q3 {
    public static void main(String[] args) {
        int[] list = new int[100];
        for (int i=0;i<100;i++){
            list[i]=(int)(Math.random()*500);
        }
        System.out.println("enter a number(0~99):");
        Scanner scanner = new Scanner(System.in);
        try {
            int n = scanner.nextInt();
            if (n<0 || n>99)
                throw new IndexOutOfBoundsException("Out of bounds!");
        }
        catch (IndexOutOfBoundsException ex){
            System.out.println("Out of bounds!");
        }
    }
}
