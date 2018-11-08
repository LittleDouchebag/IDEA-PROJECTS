import java.util.Scanner;

public class Ch5Q44 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter a short:");
        short input = scanner.nextShort();
        short compare = 0x4000;
        compare <<= 1 ;
        if (input>=0) {
            for (int i = 1; i <= 16; i++) {
                if ((short) (input & compare) == 0) {
                    System.out.print("0");
                }
                else{
                    System.out.print("1");
                }
                input <<= 1;
            }
        }
        else{

            for (int i = 0; i < 32; i++)
            {
                // 0x80000000 是一个首位为1，其余位数为0的整数
                input =(short)( (input & 0x80000000 >>> i) >>> (15 - i));
            }

            System.out.println(input);
            for (int i = 1; i <= 16; i++) {
                if ((short) ((input) & compare) == 0) {
                    System.out.print("1");
                }
                else{
                    System.out.print("0");
                }
                input <<= 1;
            }
        }
    }
}
