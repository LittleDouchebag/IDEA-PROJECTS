import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class ReplaceText {
//    这个程序是从args里面来完成输入的，所以需要在命令行里进行设置
    public static void main(String[] args) throws java.io.FileNotFoundException {
        System.out.println("argLength="+args.length);
        if (args.length!=4){
            System.out.println("Usage: java ReplaceText sourceFile targetFile oldStr newStr");
            System.exit(1);
        }
        File sourcefile = new File(args[0]);
        if (!sourcefile.exists()){
            System.out.println("Source file "+args[0]+" does not exist!");
            System.exit(2);
        }

        File targetfile = new File(args[1]);
        if (!targetfile.exists()){
            System.out.println("Target file "+args[1]+" does not exist!");
            System.exit(3);
        }

        try (
            Scanner scanner = new Scanner(sourcefile);
            PrintWriter output = new PrintWriter(targetfile)
            )
        {
            while (scanner.hasNext()){
                String s1 = scanner.nextLine();
                String s2 = s1.replaceAll(args[2],args[3]);
                output.println(s2);
            }
        }
    }
}
