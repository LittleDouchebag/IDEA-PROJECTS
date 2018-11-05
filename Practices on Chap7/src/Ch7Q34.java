import java.util.Scanner;

public class Ch7Q34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter A String of lowercase characters:");
        String input = scanner.next();
        String output= sort(input);
        System.out.println("After sort:\n"+output);
    }
    public static String sort(String s){
        int[] PerCharCount = new int[26];
        for (int i =0 ; i<s.length();i++){
            PerCharCount[s.charAt(i)-'a']++;
        }
        String output="";
        for (int i = 0 ;i<26;i++){
            for (;PerCharCount[i]>0;PerCharCount[i]--){
                output += (char)(i+'a');
            }
        }
        return output;
    }
}
