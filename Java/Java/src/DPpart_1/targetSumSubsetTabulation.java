package DPpart_1;

public class targetSumSubsetTabulation {
    public static void main(String[] args) {
            int arr[]={4, 2, 7, 1, 3};
            int sum=10;
            int n= arr.length;
            System.out.println(targetSumSubset(arr,sum,n));
    }
    public static boolean targetSumSubset(int arr[],int sum, int n){
        boolean dp[][]= new boolean[n + 1][sum+1];
        for(int i =0 ; i<n+1; i++){
            dp[i][0]=true;
        }
        for(int i=1 ; i < n+1 ; i++){
            for(int j=1 ; j < sum+1 ; j++){
                if(arr[i-1]<=j){
                    dp[i][j]=dp[i-1][j-arr[i-1]] || dp[i-1][j];
                }
                else{
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        return dp[n][sum];
    }
}
