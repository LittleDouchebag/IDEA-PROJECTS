public class Ch4Q25 {
    public static void main(String[] args) {
        String CarID="";
        char c;
        for(int i=1,random;i<8;i++) {
            if (i < 4) {
                random = (int) (Math.random() * 26);
                c = (char) (random + 'A');
            } else {
                random = (int) (Math.random() * 10);
                c = (char) (random + '0');
            }
            CarID = CarID + c;
        }
        System.out.println(CarID);
    }
}
