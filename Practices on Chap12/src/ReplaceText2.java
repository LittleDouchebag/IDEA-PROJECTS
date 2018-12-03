import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class ReplaceText2 {
    //    这个程序在程序内部读取试试
    public static void main(String[] args) throws java.io.FileNotFoundException {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("which file to input?");
        String inputPos=scanner1.next();
        File sourceFile = new File(inputPos);
        if (!sourceFile.exists()){
            System.out.println("Source file "+inputPos+" does not exist!");
            System.exit(1);
        }
        System.out.println("which file to Output?");
        String outputPos=scanner1.next();
        File targetFile = new File(outputPos);
        if (!targetFile.exists()){
            System.out.println("Target file "+outputPos+" does not exist!");
            System.exit(2);
        }
        scanner1.nextLine();
        System.out.println("target?(Enter to confirm)");
        String target = scanner1.nextLine();

        System.out.println("what to replace?(Enter to confirm)");
        String replace = scanner1.nextLine();
        try (
                Scanner scanner2 = new Scanner(sourceFile);
                PrintWriter output = new PrintWriter(targetFile)
        )

        {
            while (scanner2.hasNext()){
                String s1 = scanner2.nextLine();
                String s2 = s1.replaceAll(target,replace);
                output.println(s2);
            }
        }
        System.out.println("Completed!");
    }
}
