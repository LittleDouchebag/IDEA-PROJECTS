import java.io.File;
import java.util.Scanner;

public class Ch12Q29 {
    public static void main(String[] args) {
        File dir = new File("directory_ops_test/test2");
        File[] files = dir.listFiles();
        for (int i=0;i<50;i++){
            String nameOfFile = files[i].getName();
            if (nameOfFile.charAt(8)=='.'){
                String newName = nameOfFile.substring(0,7)+'0'+nameOfFile.charAt(7);
                File Renamed = new File("directory_ops_test/test2/"+newName+".txt");
                files[i].renameTo(Renamed);
            }
        }
    }
}
