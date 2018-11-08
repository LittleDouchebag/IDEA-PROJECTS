public class TestSimpleCircle {
    public static void main(String[] args) {
        SimpleCircle circle1 = new SimpleCircle();
        SimpleCircle circle2 = new SimpleCircle(10);
        SimpleCircle circle3 = new SimpleCircle(20);
        System.out.println(circle1.getArea());
        System.out.println(circle2.getArea());
        System.out.println(circle3.getArea());
        circle2.setRadius(5);
        System.out.println(circle2.getPerimeter());
    }
}
class SimpleCircle{
    double radius;

    SimpleCircle(){
        radius = 1;
    }

    SimpleCircle(double newRadius){
        radius = newRadius;
    }

    double getArea(){
        return radius*radius*Math.PI;
    }

    double getPerimeter(){
        return 2 * radius * Math.PI;
    }

    void setRadius(double newRadius){
        radius = newRadius;
    }
}