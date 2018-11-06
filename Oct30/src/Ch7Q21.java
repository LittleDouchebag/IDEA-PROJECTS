import java.util.Scanner;

public class Ch7Q21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of balls");
        int ball_num = scanner.nextInt();
        System.out.println("Enter the number of slots in the bean machine");
        int slot_num = scanner.nextInt();
        int[] slots = new int[slot_num];

        for (int i = 0; i < ball_num; i++) {
            int dropcount = 0;
            for (int j = 1; j < slot_num; j++) {
                if (Math.random() >= 0.5) {
                    System.out.print("R");
                    dropcount++;
                } else
                    System.out.print("L");
            }
            slots[dropcount]++;
            System.out.println();
        }
        for (int i = 4; i >= 0; i--) {
            for (int j = 0; j < slot_num; j++) {
                if (slots[j] > i)
                    System.out.print("\t球");
                else
                    System.out.print("\t");
            }
            System.out.println();
        }
        for (int j = 0; j < slot_num; j++)
            System.out.print("\t"+(j+1));
    }
}
