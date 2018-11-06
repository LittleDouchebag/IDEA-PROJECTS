/**
 * Created by SiceLab on 2018/10/9.
 */
import java.util.Random;
public class Q3_24 {
    public static void main(String[] args) {
        String[] color = {
                "Clubs",
                "Diamonds",
                "Hearts",
                "Spades",
        };
        String[] number = {
                "Ace",
                "2",
                "3",
                "4",
                "5",
                "6",
                "7",
                "8",
                "9",
                "10",
                "Jack",
                "Queen",
                "King",
        };
        Random rand = new Random();
        int i = rand.nextInt(52);
        System.out.println("The number of the card is "+ (i+1) );
        int j = i % 13 ;
        int k = i / 13 ;
        System.out.println("The card you picked is " + number[j] + " of " + color[k]);
    }
}
