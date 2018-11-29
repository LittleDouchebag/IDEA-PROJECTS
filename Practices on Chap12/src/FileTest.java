
import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileTest {
    public static void main(String[] args) {
        java.io.File file = new java.io.File("trash/readme.txt");
        System.out.println("Does it exist? "+file.exists());
        System.out.println("The file has " + file.length()+ "bytes") ;
        System.out.println("Can it be read? " + file.canRead()) ;
        System.out.println("Can it be written? " + file.canWrite()) ;
        System.out.println("Is 1t a directory? " + file.isDirectory()) ;
        System.out.println("Is it a file? " + file.isFile()) ;
        System.out.println( "Is it absolute?" + file.isAbsolute() ) ;
        System.out.println("Is it hidden? " + file.isHidden()) ;
        System.out.println("Absolute path is " + file.getAbsolutePath() ) ;
        System.out.println( "Last modified on " + new java.util.Date(file.lastModified() ) );
        Scanner scanner = new Scanner(System.in);
        try( PrintWriter output = new PrintWriter(file)) {
//            PrintWriter output = new PrintWriter(file);
            System.out.println("what to enter?");
            output.print(scanner.nextLine());
//            给try后声明创建PrintWriter不用后面close很舒服
//            这样在try括号里加的资源必须是Autocloseable！
//            output.close();
        }
        catch (java.io.FileNotFoundException ex){
            System.out.println("File not found!");
        }
        try (Scanner input = new Scanner(new File("trash/readme.txt"))){
            System.out.println(input.nextInt());
            System.out.println(input.next());
            System.out.println(input.nextLine());
        }
        catch (java.io.FileNotFoundException ex){
            System.out.println("File not found!");
        }
//        所以行分隔符就是回车了呗
        System.out.println("\nNow is lineSeparator test!\n");
        String lineSeparator = System.getProperty("line.separator");
        System.out.println(lineSeparator);
    }
}
