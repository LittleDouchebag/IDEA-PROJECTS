import java.util.ArrayList;

public class ComparableSquare {
    public static void main(String[] args) {
        ArrayList<Square> squares = new ArrayList<>();
        squares.add(new Square(10));
        squares.add(new Square(5));
        squares.add(new Square(1));
        squares.add(new Square(100));
        squares.add(new Square(107));
        int max=0;
        int i=0;
        for (Square square : squares){
            if (square.compareTo(squares.get(max))>0)
                max = i;
            i++;
        }
//        for (int i=1;i<squares.size();i++) {
//            if (squares.get(max).compareTo(squares.get(i)) < 0)
//                max = i;
//        }
        System.out.println("max is square"+ max+" line is "+squares.get(max).line);
        System.out.println(Square.SquareCount);

    }

}

class Square implements Comparable<Square>{
    double line = 0;
    protected static int SquareCount=0;
    public Square(){
        line = 1;
        SquareCount++;
    }
    public Square(double line){
        this.line = line;
        SquareCount++;
    }
    public double getArea(){
        return line*line;
    }
    @Override
    public int compareTo(Square square2){
        if (getArea()<square2.getArea())
            return -1;
        else if (getArea()==square2.getArea())
            return 0;
        else
            return 1;
    }
}