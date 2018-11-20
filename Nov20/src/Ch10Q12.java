public class Ch10Q12 {
    public static void main(String[] args) {
        Triangle2D t1 = new Triangle2D(new MyPoint(2.5,2),new MyPoint(4.2,3),new MyPoint(5,3.5));
        System.out.println(t1.getArea());
        System.out.println(t1.getPerimeter());
        if (t1.contains(new MyPoint(3,3))){
            System.out.println("contains 3,3");
        }
        if (t1.contains(new MyPoint(2.9,2),new MyPoint(4 ,1),new MyPoint(1,3.4)))
            System.out.println("contains triangle");
        if (t1.overlaps(new MyPoint(2,5.5),new MyPoint(4,-3),new MyPoint(2,6.5)))
            System.out.println("Overlaps");
    }
}

class MyPoint {
    double x;
    double y;

    public MyPoint() {
        x = 0;
        y = 0;
    }

    public MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distance(double x, double y) {
        return Math.pow((x - this.x) * (x - this.x) + (y - this.y) * (y - this.y), 0.5);
    }

    public double distance(MyPoint AnotherPoint) {
        return Math.pow((AnotherPoint.x - this.x) * (AnotherPoint.x - this.x) + (AnotherPoint.y - this.y) * (AnotherPoint.y - this.y), 0.5);
    }
}

class Triangle2D {
    MyPoint p1;
    MyPoint p2;
    MyPoint p3;

    public Triangle2D() {
        p1 = new MyPoint(0, 0);
        p2 = new MyPoint(1, 1);
        p3 = new MyPoint(2, 5);
    }

    public Triangle2D(MyPoint p1,MyPoint p2,MyPoint p3) {
        this.p1 =p1;
        this.p2=p2;
        this.p3=p3;
    }

    public double getArea() {
        double s = 0.5 * (p1.distance(p2) + p1.distance(p3) + p2.distance(p3));
        return Math.pow(s * (s - p1.distance(p2)) * (p2.distance(p3)) * p3.distance(p1), 0.5);
    }

    public double getPerimeter() {
        return p1.distance(p2) + p1.distance(p3) + p2.distance(p3);
    }

    public boolean contains(MyPoint p) {
        if (crossCheck(p,p1,p2,p3)==false)
            return false;
        if (crossCheck(p,p2,p1,p3)==false)
            return false;
        if (crossCheck(p,p3,p1,p2)==false)
            return false;
        return true;
    }

    public boolean contains(MyPoint p4,MyPoint p5,MyPoint p6){
        if (contains(p4)&&contains(p5)&&contains(p6))
            return true;
        return false;
    }

    public boolean overlaps(MyPoint p4,MyPoint p5,MyPoint p6){
        if (contains(p4,p5,p6))
            return false;
        if (crossCheck(p1,p2,p4,p5)||crossCheck(p1,p2,p4,p6)||crossCheck(p1,p2,p5,p6)||
                crossCheck(p1,p3,p4,p5)||crossCheck(p1,p3,p4,p6)||crossCheck(p1,p3,p5,p6)||
                    crossCheck(p2,p3,p4,p5)||crossCheck(p2,p3,p4,p6)||crossCheck(p2,p3,p5,p6))
            return true;
        return false;
    }

    public boolean crossCheck(MyPoint p1, MyPoint p2, MyPoint p3, MyPoint p4) {
        double a = p1.y - p2.y;
        double b = p2.x - p1.x;
        double e = (p1.y - p2.y) * p1.x - (p1.x - p2.x) * p1.y;
        double c = p3.y - p4.y;
        double d = p4.x - p3.x;
        double f = (p3.y - p4.y) * p3.x - (p3.x - p4.x) * p3.y;
        double x = (e*d-b*f)/(a*d-b*c);
        double y = (a*f-e*c)/(a*d-b*c);
        if ((x>=Math.min(p1.x,p2.x)&& x<=Math.max(p1.x,p2.x))&&(x>=Math.min(p3.x,p4.x)&& x<=Math.max(p3.x,p4.x))&&(x>=Math.min(p1.y,p2.y)&& x<=Math.max(p1.y,p2.y))&&(x>=Math.min(p3.y,p4.y)&& x<=Math.max(p3.y,p4.y)))
                return true;
        return false;
    }
}