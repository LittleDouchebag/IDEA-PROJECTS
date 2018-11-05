import java.util.Scanner;

public class Dec2Hex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a decimal integer:");
        int dec_num = scanner.nextInt();
        String Hex_num = "";

        for(char Hex_digit;dec_num==0;dec_num = dec_num / 16){
            if (dec_num%16<10)
                Hex_digit =(char)( dec_num % 16 + 48);
            else
                Hex_digit =(char)( dec_num % 16 + 55);
            Hex_num = Hex_num + Hex_digit;
        }
        System.out.println("After Dec2Hex:\n" + Hex_num );
    }
}
