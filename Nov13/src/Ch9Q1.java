public class Ch9Q1 {
    public static void main(String[] args) {

    }

}
class rectangle{
    double height,width;

    rectangle(){
        height=1;
        width=2;
    }

    rectangle(double newWidth,double newHeight) {
        width = newWidth;
        height= newHeight;
    }

    double getHeight(){
        return height;
    }
    double getWidth(){
        return width;
    }
    double getArea(){
        return height*width;
    }

}
