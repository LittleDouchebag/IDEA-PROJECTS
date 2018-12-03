import java.io.File;
import java.util.Scanner;

//         （创建一个目录）编写一个程序，提示用户输人一个目录名称，然后使用File 的mkdirs 方法
//      创建相应的目录。如果目录创建成功则显示“ Directory created successfully ”，如果目录已经存
//      在，则显示“ Directory already exists”
public class Ch12Q26 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a directory path:");
        File directory = new File(scanner.next());
        if (directory.exists()) {
            System.out.println("Already Exists!");
            System.exit(1);
        }
        if (directory.mkdir())
            System.out.println("Directory created successfully!");
        else
            System.out.println("Failed!");
    }
}
