public class Ch9Q6 {
    public static void main(String[] args) {
        double[] v = new double[100000];
        for (int i=0;i<100000;i++){
            v[i] = Math.random();
        }
        stopwatch stopwatch = new stopwatch();
        stopwatch.begin();
        for (int i=0;i<99999;i++){
            for (int j=i+1;j<100000;j++){
                if (v[i]<v[j]){
                    double temp=v[i];
                    v[i] = v[j];
                    v[j] = temp;
                }
            }
        }
        stopwatch.stop();
        System.out.println("total time:"+ stopwatch.getElapsedTime()/1000);
    }
}

class stopwatch{
    private long starttime=0;
    private long endtime=0;

    void begin(){
        starttime = System.currentTimeMillis();
    }

    void stop(){
        endtime = System.currentTimeMillis();
    }

    double getElapsedTime(){
        return endtime - starttime ;
    }
}


