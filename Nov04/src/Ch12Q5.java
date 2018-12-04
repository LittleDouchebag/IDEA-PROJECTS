public class Ch12Q5 {
    public static void main(String[] args) throws IllegalTriangleException {
        Triangle triangle = new Triangle(1, 1, 2);
    }

}

class Triangle {
    double a, b, c;

    public Triangle() {
        a = 1;
        b = 1;
        c = 1;
    }

    public Triangle(double a, double b, double c) throws IllegalTriangleException {
        this.a = a;
        this.b = b;
        this.c = c;

        if (a + b <= c || c + b <= a || a + c <= b)
            throw new IllegalTriangleException(a,b,c);

    }
}

class IllegalTriangleException extends Exception {
//    也可以弄一弄里面的，比如精确化错误，输入三个边猜一下是哪出现了问题
    IllegalTriangleException(){

    }
    IllegalTriangleException(double a,double b,double c){
        if (a+b<=c)
            System.out.println("Error!"+a+" + "+b+" <= "+c);
        if (c+b<=a)
            System.out.println("Error!"+c+" + "+b+" <= "+a);
        if (a+c<=b)
            System.out.println("Error!"+a+" + "+c+" <= "+b);
    }
}
