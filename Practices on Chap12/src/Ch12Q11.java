import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Ch12Q11 {
    public static void main(String[] args) throws Exception {
        if (args.length != 2) {
            System.out.println("java Ch12Q11 String2Bdeleted filename");
            System.exit(1);
        }
        File targetFile = new File(args[1]);
        Scanner scanner = new Scanner(targetFile);
        ArrayList<String> buffer = new ArrayList<>();
        while (scanner.hasNext()) {
            String line = scanner.nextLine();
            line = line.replaceAll(args[0], "");
            System.out.println(line);
            buffer.add(line);
        }
        PrintWriter printwriter = new PrintWriter(targetFile);
        while (buffer.size()!=0){
            printwriter.println(buffer.get(0));
            buffer.remove(0);
        }
        printwriter.close();
    }
}
