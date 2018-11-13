import java.util.Scanner;

public class Ch10Q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StackOfIntergers stackOfIntergers = new StackOfIntergers();
        System.out.println("Enter an integer:");
        int input = scanner.nextInt();
        while (input!=1){
            for (int i=2;i<=input;i++){
                if (input%i==0){
                    input = input / i;
                    stackOfIntergers.push(i);
                    break;
                }
            }
        }
        while (stackOfIntergers.getTop()!=0){
            System.out.print(stackOfIntergers.pop()+",");
        }
    }
}
class StackOfIntergers{
    int top = 0;
    int[] Ints = new int[1000];
    StackOfIntergers(){}
    void push(int pushin){
        Ints[top++] = pushin;
    }
    int pop(){
        return Ints[--top];
    }
    int getTop(){
        return top;
    }
}