public class Ch8Q4 {
    public static void main(String[] args) {
        int[][] work_hours = {
                {1,2,3,4,5,6,7},
                {1,1,1,1,1,1,1},
                {2,2,2,2,2,2,2},
                {4,3,2,1,5,6,8},

        };
        int[][] sum_rank=new int[4][2];
        for (int i=0;i<4;i++){
            for (int j=0;j<7;j++){
                sum_rank[i][0]+=work_hours[i][j];
                sum_rank[i][1]=i;
            }
        }
        for (int i=0,temp=0;i<3;i++){
            for (int j=i+1;j<4;j++){
                if (sum_rank[i][0]<sum_rank[j][0]) {
                    temp=sum_rank[j][0];
                    sum_rank[j][0]=sum_rank[i][0];
                    sum_rank[i][0]=temp;

                    temp=sum_rank[j][1];
                    sum_rank[j][1]=sum_rank[i][1];
                    sum_rank[i][1]=temp;

                }


            }
        }
        for (int i=0;i<4;i++){
            System.out.println("Employee "+sum_rank[i][1] +"   "+sum_rank[i][0]);
        }
    }
}
