public class Ch5Q25 {
    public static void main(String[] args) {
        double pi=0;
        for(int i=1;i<=100000;i++){
            if (i % 2 == 1)
                pi += 1.0/(2 * i-1);
            else
                pi -= 1.0/(2 * i-1);
            if (i % 10000 == 0)
                System.out.println("when i = "+i+" pi = "+ 4 * pi);
        }

    }
}
