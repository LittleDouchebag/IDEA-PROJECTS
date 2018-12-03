import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class FilesCreator {
    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many files(.txt) you want to create?");
        int n = scanner.nextInt();

        for (int i=0;i<n;i++){
            File file = new File("directory_ops_test/"+"Crazy8_"+i+".txt");
            file.createNewFile();
            PrintWriter printWriter = new PrintWriter(file);
            printWriter.println("This is file NO."+i+".");
            printWriter.close();
        }
    }
}
