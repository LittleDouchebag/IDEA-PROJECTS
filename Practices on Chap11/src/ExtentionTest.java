public class ExtentionTest {
    public static void main(String[] args) {
        circle c1 = new circle(100);
        System.out.println(c1.color);
        System.out.println(c1.radius);
        circle c2 = new circle("BLACK","Jimmy Joe");
        System.out.println(c2.color);
        System.out.println(c2.ID);

    }
}

class GeometricStuffs{
    String color="Blue";
    String ID = "Jon";
    public GeometricStuffs(){

    }
    public GeometricStuffs(String color,String ID){
        this.color = color;
        this.ID = ID;
    }
}

class circle extends GeometricStuffs{
    double radius = 5;
    public circle(){
        radius = 10;
    }
    public circle(double radius){
        this.radius=radius;
    }
    public circle(String color,String ID){
        super(color,ID);
    }

}