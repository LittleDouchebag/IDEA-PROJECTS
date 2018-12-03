import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Ch12Q22 {
    public static void main(String[] args) throws java.io.FileNotFoundException {
        if (args.length!=3){
            System.out.println("java Ch12Q22 dir oldString newString");
            System.exit(1);
        }
        File dir = new File(args[0]);
        File[] files = dir.listFiles();
        Scanner scanner= null;
        for (int i=0;i<files.length;i++){
            scanner = new Scanner(files[i]);
            ArrayList<String> buffer = new ArrayList<>();
            while (scanner.hasNext()){
                String line = scanner.nextLine();
                line = line.replaceAll(args[1],args[2]);
                buffer.add(line);
            }
            PrintWriter printWriter = new PrintWriter(files[i]);
            while (buffer.size()!=0){
                printWriter.println(buffer.get(0));
                buffer.remove(0);
                printWriter.close();
            }
        }
    }
}
