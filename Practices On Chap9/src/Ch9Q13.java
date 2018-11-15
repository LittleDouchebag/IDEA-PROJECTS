import java.util.Scanner;

public class Ch9Q13 {
    public static void main(String[] args) {
        System.out.println("Enter the number of rows and columns in the array:");
        Scanner scanner = new Scanner(System.in);
        int rows_array = scanner.nextInt();
        int columns_array = scanner.nextInt();
        int[][] array = new int[rows_array][columns_array];
        for (int i=0;i<rows_array;i++){
            for (int j=0;j<columns_array;j++){
                array[i][j] = (int)(Math.random()*100);
                System.out.print(array[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println("The location of the largest element is "+ locateLargest(array).max_value +" at ("+locateLargest(array).row+","+ locateLargest(array).column+")");
    }

    public static Location locateLargest(int[][] a){
        Location location = new Location();
        location.max_value= a[0][0];
        for (int i=0;i<a.length;i++){
            for (int j=0;j<a[0].length;j++){
                if (a[i][j]>location.max_value){
                    location.max_value = a[i][j];
                    location.row = i;
                    location.column = j;
                }
            }
        }
        return location;
    }

}

class Location{
    int row=0,column=0,max_value;

    public void setRow(int row) {
        this.row = row;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public void setMax_value(int max_value) {
        this.max_value = max_value;
    }
}
