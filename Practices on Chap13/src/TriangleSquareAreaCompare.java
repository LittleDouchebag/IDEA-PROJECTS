public class TriangleSquareAreaCompare {
    public static void main(String[] args) {
        Geometrics triangle1 = new triangle(1,2,3);
        Geometrics square1 = new happysquare(2);
        if (triangle1.areaCompare(square1)>=0)
            System.out.println("big");
        else System.out.println("small");
        if (triangle1 instanceof basicInterface)
            System.out.println(((triangle) triangle1).toSomeString());
    }
}

abstract class Geometrics{
    abstract double getArea();
    public int areaCompare(Geometrics geo2compare){
        if (getArea()>geo2compare.getArea())
            return 1;
        else if (getArea()==geo2compare.getArea())
            return 0;
        else
            return -1;
    }
}

class triangle extends Geometrics implements basicInterface{
    double a,b,c;
    public triangle(){
        a=1;b=1;c=1;
    }
    public triangle(double a,double b,double c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    @Override
    double getArea(){
        double p = 0.5*(a+b+c);
        return Math.pow(p*(p-a)*(p-b)*(p-c),0.5);
    }
    @Override
    public String toSomeString(){
        return "This is a triangle!";
    }

}

class happysquare extends Geometrics implements basicInterface{
    double line;
    public happysquare(){
        line = 1;
    }
    public happysquare(double line){
        this.line = line;
    }
    @Override
    double getArea(){
        return line*line;
    }
    @Override
    public String toSomeString(){
        return "This is a square!";
    }
}

interface basicInterface{
    String toSomeString();
}
