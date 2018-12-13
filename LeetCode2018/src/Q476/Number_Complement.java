package Q476;

public class Number_Complement {
    public static void main(String[] args) {
        System.out.println(findComplement(-1));
    }
    public static int findComplement(int num) {
        int sum=0;
        for (int temp=num,moveCount=0;temp!=0;temp>>=1){
            if ((temp&0x01)==0){
                sum+=Math.pow(2,moveCount);
            }
            moveCount++;
        }
        return sum;
    }
}
