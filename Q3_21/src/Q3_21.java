import java.util.Scanner;

/**
 * Created by SiceLab on 2018/10/9.
 */
public class Q3_21
{
    public static void main(String[] args) {
        String[] week= {
                "Saturday",
                "Sunday",
                "Monday",
                "Tuesday",
                "Wednesday",
                "Thursday",
                "Friday",
        };

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter Year:");
        int year = scanner.nextInt();
        System.out.println("Please Enter Month:");
        int m = scanner.nextInt();
        System.out.println("Please Enter The Day Of The Month:");
        int q = scanner.nextInt();

        if (m < 3){
            m = m + 12;
            year--;
        }

        int h , j , k;
        j = year / 100;
        k = year % 100;
        h = (q + (26*(m+1))/10 + k + k/4 + j/4 +5 * j ) % 7;

        System.out.println("Day of the week is " + week[h]);

    }
}
