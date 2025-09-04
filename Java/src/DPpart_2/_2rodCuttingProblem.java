package DPpart_2;

public class _2rodCuttingProblem {
    public static void main(String[] args) {
        int length[] = {1, 2, 3 , 4, 5, 6, 7, 8};
        int price[] =  {1, 5, 8, 9, 10 , 17, 17, 20};
        int rodLength =8;
        //Find max value obtained by cutting by the rod and selling the piece
        System.out.println(maxVal(length,price,rodLength));
    }
    public static int maxVal(int lenght[], int price[], int rodLength){
        int dp[][] = new int[rodLength+1][rodLength+1];
        for(int i=0 ; i< rodLength + 1 ;i++){
            dp[i][0]=0;
        }
        for(int j=0 ; j< rodLength+1 ; j++){
            dp[0][j]=0;
        }
        for(int i =1 ; i< rodLength+1; i++){
            for(int j=1; j<rodLength+1 ; j++){
                if(lenght[i-1]<=j){
                    dp[i][j]= Math.max(price[i-1] + dp[i][j-lenght[i-1]], dp[i-1][j]);
                }
                else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        return dp[rodLength][rodLength];
    }

}
