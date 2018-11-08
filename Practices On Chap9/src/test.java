public class test {
    double radius = 1;
    test(){
    }
    test(double newRadius){
        radius = newRadius;
    }

    double getArea(){
        return radius * radius * Math.PI;
    }
    void setRadius(double newRadius){
        radius = newRadius;
    }

}
