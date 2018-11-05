public class Ch6Q1 {
    public static void main(String[] args) {
        for (int n = 1; n < 101; n++) {
            System.out.print(getPentagonalNumber(n) + "\t");
            if (n % 10 == 0)
                System.out.println("");
        }
    }

    public static int getPentagonalNumber(int n) {
        return n * (3 * n - 1) / 2;
    }
}
