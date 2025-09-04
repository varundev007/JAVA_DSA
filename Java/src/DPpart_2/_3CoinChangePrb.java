package DPpart_2;

public class _3CoinChangePrb {
    public static void main(String[] args) {
        int coin[]= {1,2,3};
        int sum =5;
        int n = coin.length;
        // total way to create sum =5
        // 1, 1,1 ,1, 1
        //1,1,1,,2
        //1,1,3
        // 1,2,2
        //2,3=> answer =5
        System.out.println(totalWays(coin,sum,n));
    }
    public static int totalWays(int coin[], int sum, int n){
        int dp[][]= new int[n+1][sum+1];
        for(int j=0; j< sum+1 ; j++){
            dp[0][j]=0;
        }
        for(int i = 0 ; i < n+1 ; i++){
            dp[i][0]=1;
        }
        for(int i=1 ; i< n+1 ;i++){
            for(int j= 1 ; j < sum+1 ;j++){
                if(coin[i-1]<=j){
                    dp[i][j]= dp[i][j-coin[i-1]] + dp[i-1][j];
                }
                else{
                    dp[i][j]= dp[i-1][j];
                }
            }
        }
        return dp[n][sum];
    }
}
