import java.util.Scanner;

public class Ch7Q35 {
    public static void main(String[] args) {
        String[] words = {"gurentao","hejiyong","woshidashabi","lizhongkai"};
        Scanner scanner = new Scanner(System.in);
        for (;;) {
            // 从四个词中选一个
            int random_word = (int)(Math.random()*4);
            // 生成一个数组，表示词中的各个位是否猜对过
            boolean[] char_already = new boolean[words[random_word].length()];
            for (;;) {
                int miss_count = 0;
                boolean flag = false;
                System.out.print("(Guess) Enter a letter in word ");

                // 扫描已经有哪些位被猜对过，如有为*
                for (int i=0;i<words[random_word].length();i++){
                    if (char_already[i])
                        System.out.print(words[random_word].charAt(i));
                    else
                        System.out.print("*");
                }
                System.out.print("  >  ");


                char guess = scanner.next().charAt(0);
                String guess_right = "";
                // 扫描当前输入是否已经猜过

                for (int i=0;i<words[random_word].length();i++){
                    if (guess==words[random_word].charAt(i)) {
                        if (char_already[i]) {
                            System.out.println(words[random_word].charAt(i) + " is already in the word!");
                            flag = true;
                            break;
                        }
                        // 如果没有猜过，扫描是否在词里，如在加入guessright，并修改charalready对应位
                        char_already[i]=true;
                        flag = true;
                    }
                }
                if (flag==false) {
                    System.out.println(guess + " is not in the word!");
                    miss_count++;
                }
                flag = true;
                for (int i=0;i<words[random_word].length();i++){
                    if (char_already[i]==false){
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    System.out.println("The word is " + words[random_word] + ". You missed 1 time");
                    System.out.print("Do you want to guess another word? Enter y or n > ");
                    char choice = scanner.next().charAt(0);
                    if (choice=='y'||choice=='Y'){
                        System.out.println("Good lets play again!");
                        break;
                    }
                    else if (choice=='n'||choice=='N')
                        return;
                    else
                        System.out.println("invalid input! \nDo you want to guess another word? Enter y or n >");
                }
            }
        }
    }
}
