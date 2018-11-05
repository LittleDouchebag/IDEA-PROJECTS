import java.util.Scanner;

public class Ch5Q44 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter am integer:");
        short input = scanner.nextShort();
        short compare = 0x4000;
        compare <<= 1;

            for(int i=0;i<16;i++){
                if ((short)(input & compare) == 0){
                    System.out.print("0");
                }
                else {
                    System.out.print("1");
                }
                input <<=1;
            }

    }
}
