public class Ch6Q26 {
    public static void main(String[] args) {
        for (int i=2,count=0;count<100;i++){
            if (sushu_test(i)==1) {
                if (huiwen_test(i) == 1) {
                    if (i<10000) {
                        System.out.printf("%-8d",i);
                    }
                    else
                        System.out.printf("%-8d",i);
                    count++;
                    if (count!=0 && count % 10 ==0)
                        System.out.println();
                }
            }

        }
    }
    public static int sushu_test(int i){
        for (int j = 1 ; j < i ; j++ ) {
            if (i % j == 0 && j != 1)
                return 0;
        }
        return 1;
    }
    public  static int huiwen_test(int i){
        int reverse = 0;
        for (int temp_i = i;temp_i!=0;){
            reverse =reverse * 10 + temp_i % 10;
            temp_i = temp_i / 10;
        }
        if (reverse == i)
            return 1;
        else
            return 0;
    }
}
