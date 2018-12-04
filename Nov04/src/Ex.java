import java.util.ArrayList;

public class Ex {
    public static void main(String[] args) {
        ArrayList<Student> Students = new ArrayList<>();
        int rightCount=0,falseCount=0,rightSum=0,falseSum=0;
        for (int i=0;i<1000;i++){
            Students.add(new Student((int)(1+Math.random()*150)));
            try {
                if (Students.get(i).getScore() > 100)
                    throw new ScoreExceedsMaxValueException(Students.get(i).getScore());
                rightCount++;
                rightSum+=Students.get(i).getScore();
            }
            catch (ScoreExceedsMaxValueException ex){
                falseCount++;
                falseSum+=Students.get(i).getScore();
            }
        }
        System.out.println(rightCount+"\t"+rightSum+"\t"+(double)((0.01+rightSum)/rightCount));
        System.out.println(falseCount+"\t"+falseSum+"\t"+(double)((0.01+falseSum)/falseCount));
    }
}
class Student {
    private int Score;

    public Student() {
        Score = 1;
    }

    public Student(int Score) {
        this.Score = Score;
    }
    public int getScore(){
        return Score;
    }
}
class ScoreExceedsMaxValueException extends Exception{
    public ScoreExceedsMaxValueException(int Score){
        super("Abnormal Score!");
    }
}