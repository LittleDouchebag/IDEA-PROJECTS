import java.util.Scanner;

public class Ch7Q31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter list 1:");
        int n1 = scanner.nextInt();
        int[] list1 = new int[n1];
        for (int i=0;i<n1;i++){
            list1[i] = scanner.nextInt();
        }

        System.out.println("Enter list 2:");
        int n2 = scanner.nextInt();
        int[] list2 = new int[n2];
        for (int i=0;i<n2;i++){
            list2[i] = scanner.nextInt();
        }

        int[] list = merge(list1,list2);

        System.out.println("The merged list is:");
        for (int i=0;i<n1+n2;i++){
            System.out.print("\t"+list[i]);
        }
    }

    public static int[] merge(int[] list1, int[] list2){
        int[] list = new int[list1.length+list2.length];
        int rank = 0;
        int i=0,j=0;
        for (;i<list1.length && j<list2.length;){
            if (list1[i]>list2[j])
                list[rank++] = list2[j++];
            else
                list[rank++] = list1[i++];
        }
        if (i<list1.length){
            for (;i<list1.length;)
                list[rank++] = list1[i++];
        }
        else {
            for (;j<list1.length;)
                list[rank++] = list2[j++];
        }

        return list;
    }
}
