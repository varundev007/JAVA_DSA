package DPpart_1;

public class knapSackTabulation {
    public static void main(String[] args) {
        int val[]={15,14,10,45,30};
        int wt[]= {2,5,1,3,4};
        int w=7;
        int n = val.length;
        System.out.println(knapsack(val,wt,w,n));
    }
    public static int knapsack(int val[], int wt[],int w, int n){
        int dp[][]= new int[n+1][w+1];
//        i=n, j=w
        //initalisation ie base case
        for(int i=0;i<dp.length; i++){
            for(int j=0 ; j<dp[0].length; j++){
                if(i==0 || j==0){
                    dp[i][j]=0;
                }
            }
        }

        for(int i =1; i<n+1 ; i++){
            for(int j=1; j<w+1 ; j++){
                if(wt[i-1]<=j){
                    dp[i][j]= Math.max( val[i-1] + dp[i-1][j-wt[i-1]], dp[i-1][j]);
                }
                else{
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        return dp[n][w];
    }
}
