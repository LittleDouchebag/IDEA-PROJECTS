import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class WebCrawler {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);
        System.out.println("which link to start with?");
        String StartLink = keyboardInput.next();
        ArrayList<String> listOfPendingURLS = new ArrayList<>();
        ArrayList<String> listOfTraversedURLS = new ArrayList<>();
        listOfPendingURLS.add(StartLink);

        while (listOfTraversedURLS.size()<101 && listOfPendingURLS.size()>0){
            String next2traverse = listOfPendingURLS.get(0);
            listOfPendingURLS.remove(0);
            listOfTraversedURLS.add(next2traverse);
            System.out.println("Now Crawling to:"+next2traverse);

//          CrawlingProcess(next2traverse,listOfPendingURLS,listOfTraversedURLS);

            try {
                java.net.URL url = new java.net.URL(next2traverse);
                Scanner urlInput = new Scanner(url.openStream());
                while (urlInput.hasNext()){
                    String line = urlInput.nextLine();
                    int StartCursor = 0;
                    StartCursor = line.indexOf("\"http://",StartCursor) + 1;
                    while (StartCursor>0) {
                        int EndCursor = line.indexOf("\"",StartCursor+1);
                        if (EndCursor>0) {
                            if (!listOfTraversedURLS.contains(line.substring(StartCursor, EndCursor)))
                                listOfPendingURLS.add(line.substring(StartCursor, EndCursor));
                            StartCursor = EndCursor;
                        }
                        else StartCursor=-1;
                        StartCursor = line.indexOf("http://", StartCursor);
                    }
                }

            }
            catch (java.net.MalformedURLException ex){
                System.out.println("Error!! No such url:"+next2traverse);
            }
            catch (java.io.IOException ex){
                System.out.println("Error!! No such I/O!");
            }
        }
    }

}
