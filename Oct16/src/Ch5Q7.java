public class Ch5Q7 {
    public static void main(String[] args) {
        int fee = 10000, sum = 0;
        for (int i = 0; i < 10; i++) {
            if (i < 4)
                sum += fee;
            fee *= 1.05;
        }
        System.out.println("The fee in 2028 will be " + fee + "\nAnd the total fee you have to pay to guaduate is " + sum);
    }
}
