import java.util.Scanner;

public class Ch7Q32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter list:");
        int num = scanner.nextInt();
        int[] list = new int[num];
        for (int i=0;i<num;i++){
            list[i] = scanner.nextInt();
        }
        int[] output = partition(list);
        for (int i=0;i<output.length;i++){
            System.out.print("\t"+output[i]);
        }
    }
    public static int[] partition(int[] list){
        int[] partitioned = new int[list.length];
        int j = 0;
        for (int i=1,k= list.length-1;i<list.length;){
            if (list[0]>list[i]) {
                partitioned[j++]=list[i++];
            }
            else
                partitioned[k--]=list[i++];
        }
        partitioned[j]=list[0];
        return partitioned;
    }
}
