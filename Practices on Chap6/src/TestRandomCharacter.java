import java.util.Scanner;

public class TestRandomCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the character to begin?");
        char Start = scanner.next().charAt(0);
        System.out.println("Enter the character to end?");
        char End = scanner.next().charAt(0);
        for(int i=0;i<20;i++) {
            PrintRandomCharacter(Start, End);
        }
        System.out.println("\nR U HAPPY?");
    }
    public static void PrintRandomCharacter(char Start,char End){
        int random = (int)(Math.random()*(End-Start));
        System.out.print((char)(Start+random));
    }
}
