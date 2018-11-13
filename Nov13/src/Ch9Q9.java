public class Ch9Q9 {
    public static void main(String[] args) {
        RegularPolygon regularPolygon0 = new RegularPolygon();
        RegularPolygon regularPolygon1 = new RegularPolygon(6,4);
        RegularPolygon regularPolygon2 = new RegularPolygon(10,4,5.6,7.8);
        System.out.println("RP0: Perimeter="+regularPolygon0.getPerimeter()+",Area="+regularPolygon0.getArea());
        System.out.println("RP1: Perimeter="+regularPolygon1.getPerimeter()+",Area="+regularPolygon1.getArea());
        System.out.println("RP2: Perimeter="+regularPolygon2.getPerimeter()+",Area="+regularPolygon2.getArea());
    }
}

class RegularPolygon{
    int n=3;
    double side = 1;
    double x = 0;
    double y = 0;

    RegularPolygon(){}
    RegularPolygon(int n, double side){
        this.n = n;
        this.side = side;
    }
    RegularPolygon(int n, double side,double x,double y){
        this.n = n;
        this.side = side;
        this.x = x;
        this.y = y;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    double getPerimeter(){
        return n*side;
    }

    double getArea(){
        return (n*side*side)/(4*Math.tan(Math.PI/n));
    }
}
