import java.util.Scanner;
public class TestVoidMethod_ex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your grade");
        double grade = scanner.nextDouble();
        printGrade(grade);
    }

    public static void printGrade(double grade) {
        if (grade>=90)
            System.out.println("A");
        else if (grade >=80)
            System.out.println("B");
        else if (grade >= 70)
            System.out.println("C");
        else if (grade >=60)
            System.out.println("D");
        else
            System.out.println("F");
    }
}
