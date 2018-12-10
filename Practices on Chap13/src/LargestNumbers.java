import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;

public class LargestNumbers {
    public static void main(String[] args) {
        ArrayList<Number> list = new ArrayList<>();
        list.add(45);
        list.add(12.3333);
        list.add(new BigInteger("12412512566"));
        list.add(new BigDecimal("2.125125236346"));
        PrintLargestNumber(list);
    }
    public static void PrintLargestNumber(ArrayList<Number> list){
        if (list.size()==0)
            return;
        Number number = list.get(0);
        for (int i=0;i<list.size();i++){
            if (number.doubleValue()<list.get(i).doubleValue())
                   number = list.get(i);
        }
        System.out.println(number);
    }
}
