import java.io.PrintWriter;
import java.io.Writer;
import java.net.MalformedURLException;
import java.util.Scanner;

public class ReadFileFromURL {
    public static void main(String[] args) {
        System.out.println("enter the full url you want to try:");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        int charCount = 0;
        try(PrintWriter writer = new PrintWriter("shabi.txt")){
            java.net.URL url = new java.net.URL(input);
            Scanner WebScanner = new Scanner(url.openStream());
            while (WebScanner.hasNext()){
                String line = WebScanner.nextLine();
                charCount += line.length();
                writer.println(line);
            }
            System.out.println("total length: "+charCount);
        }
        catch (MalformedURLException ex){
            System.out.println("No such url");
        }
        catch (java.io.IOException ex){
            System.out.println("No such file");
        }
    }
}
