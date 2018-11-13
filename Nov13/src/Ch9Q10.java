import java.util.Scanner;

public class Ch9Q10 {
    public static void main(String[] args) {
        System.out.println("Enter a,b,c");
        Scanner scanner = new Scanner(System.in);
        QuadraticEquation quadEqua = new QuadraticEquation();
        quadEqua.setA(scanner.nextInt());
        quadEqua.setB(scanner.nextInt());
        quadEqua.setC(scanner.nextInt());
        if (quadEqua.getDiscriminant()==0){
            System.out.println(quadEqua.getRoot1());
        }
        else
            System.out.println(quadEqua.getRoot1()+" , "+quadEqua.getRoot2());

    }
}

class QuadraticEquation{
    private double a,b,c;

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    double getDiscriminant(){
        return b*b - 4*a*c;
    }

    String getRoot1(){
        if (getDiscriminant()>=0)
            return "x1="+(Math.pow(b*b - 4*a*c,0.5)-b)/(2*a);
        else{
            return "x1="+(-b)/(2*a)+"+"+Math.pow(-1*(b*b - 4*a*c),0.5);
        }
    }

    String getRoot2(){
        if (getDiscriminant()>0)
            return "x2="+(-1*Math.pow(b*b - 4*a*c,0.5)-b)/(2*a)+"i";
        else{
            return "x2="+(-b)/(2*a)+"-"+Math.pow(-1*(b*b - 4*a*c),0.5)+"i";
        }
    }

}