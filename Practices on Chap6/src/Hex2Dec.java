import java.util.Scanner;
public class Hex2Dec {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Plz enter a hex number:");
        String Hex = scanner.next();
        int Dec = HexToDec(Hex);
        System.out.println(Hex + " is "+Dec+" in Dec.");
    }
    private static int HexToDec(String Hex){
        int dec = 0;
        for(int i=0;i<Hex.length();i++){
            if (Hex.charAt(i)>='A' && Hex.charAt(i) <='F')
                dec = dec * 16 + Hex.charAt(i)-55;
            else
                dec = dec * 16 + Hex.charAt(i)-48;
        }
        return dec;
    }
}
