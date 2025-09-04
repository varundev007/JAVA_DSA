package DPpart_5MatrixChainMultiplication;

import java.util.Arrays;

public class _2MCMmemoization {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,3};
        //Dimention of arr[i] = arr[i-1]*arr[i]
        int n = arr.length;
        int dp[][] =  new int[n][n];
        for(int i =0 ; i < n ; i++){
            Arrays.fill(dp[i], -1);
        }
        System.out.println(finDMin(arr, 1, n-1, dp));
    }
    public static int finDMin(int arr[], int i , int j , int dp[][]){
        int ans = Integer.MAX_VALUE;
        if(dp[i][j] != -1){
            return dp[i][j];
        }
        if(i>=j){
            return 0;
        }
        else{
            for(int k = i ; k <= j-1 ; k++){
                ans = Math.min(ans, finDMin(arr,  i, k , dp) + finDMin(arr, k+1, j, dp)  + arr[i-1] * arr[k] * arr[j]) ;
            }
        }
        return dp[i][j]= ans;
    }
}
