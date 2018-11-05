import java.util.Scanner;

public class FindNearestPoints {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of points:");
        int num_points = scanner.nextInt();
        int[][] matrix = new int[num_points][2];
        for (int i=0;i<num_points;i++){
            System.out.println("Enter point "+i);
            matrix[i][0] = scanner.nextInt();
            matrix[i][1] = scanner.nextInt();
        }
        int[] x1=new int[10];
        x1[0]=num_points-2;
        int[] x2=new int[10];
        x2[0]=num_points-1;
        int count = 0;
        double min_distance = Math.pow(Math.pow(matrix[num_points-2][0]-matrix[num_points-1][0],2)+Math.pow(matrix[num_points-2][1]-matrix[num_points-1][1],2),0.5);
        for (int i=0;i<num_points-2;i++){
            for (int j=i+1;j<num_points;j++){
                double distance = Math.pow(Math.pow(matrix[i][0]-matrix[j][0],2)+Math.pow(matrix[i][1]-matrix[j][1],2),0.5);
                if (distance <= min_distance) {
                    min_distance = distance;
                    x1[count]=i;
                    x2[count++]=j;
                }
            }
        }
        System.out.println("min is " + min_distance + ".");
        for (int i=0;i<count;i++) {
            System.out.println("From (" + matrix[x1[i]][0] + "," + matrix[x1[i]][1] + ") and (" + matrix[x2[i]][0] + "," + matrix[x2[i]][1] + ").");

        }
    }
}