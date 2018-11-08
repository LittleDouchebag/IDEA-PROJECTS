import java.util.Scanner;

public class Ch6Q31 {
    public static void main(String[] args) {
        System.out.println("Enter your number");
        Scanner scanner = new Scanner(System.in);
        long CardNum = scanner.nextLong();
        if (isVa1id(CardNum))
            System.out.println("Valid!");
        else
            System.out.println("Invalid!");
    }
    /** Return true if the card number is valid */
    public static boolean isVa1id(long number) {
        if (getSize(number)<12 || getSize(number)>16)
            return false;
        if ((sumOfDoubleEvenPIace(number)+sumOfOddPlace(number))%10!=0)
            return false;
        if (prefixMatched(number,1) || prefixMatched(number,2))
            return true;
        else
            return false;
    }

    //Get the result from Step 2
    public static int sumOfDoubleEvenPIace(long number) {
        int sum=0;
        number /= 10;
        for (;number>0;){
            sum += getDigit((int)(number%10)*2);
            number /= 100;
        }
        return sum;
    }

    /** Return this number if it is a single digit, otherwise ,
     * return the sum of the two digits */
    public static int getDigit(int number) {
        if (number>9)
            return number%10+number/10;
        return number;
    }

    /** Return sum of odd-place digits in number */
    public static int sumOfOddPlace(long number) {
        int sum =0;
        for(;number>0;){
            sum += number%10;
            sum /= 100;
        }
        return sum;
    }

    /** Return true if the digit d is a prefix for number */
    public static boolean prefixMatched(long number, int d) {
        if (getPrefix(number,d)==4 || getPrefix(number,d)==5 ||
                getPrefix(number,d)==37 ||getPrefix(number,d)==6 )
            return true;
        return false;
    }

    /** Return the number of digits in d V */
    public static int getSize(long d) {
        int i=0;
        for (;d>0;i++){
            d/=10;
        }
        return i;
    }

    /** Return the first k number of digits from number. If the
    * number of digits in number is less than k , return number. */
    public static long getPrefix(long number, int k) {
        for (int i=0;i<getSize(number)-k;i++){
            number /= 10;
        }
        return number;
    }
}
