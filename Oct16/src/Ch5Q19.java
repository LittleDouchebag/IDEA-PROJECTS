public class Ch5Q19 {
    public static void main(String[] args) {
        for(int i=1;i<9;i++){
            for (int j=1;j<16;j++){
                if (j>8-i && j<=8)
                    System.out.print("\t"+ (int)(Math.pow(2,(j-9+i))));
                else if (j>8 && j<8+i)
                    System.out.print("\t"+ (int)(Math.pow(2,(7-j+i))));
                else
                    System.out.print("\t");
            }
            System.out.print("\n");
        }
    }
}
