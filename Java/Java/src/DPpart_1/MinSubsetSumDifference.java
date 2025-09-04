package DPpart_1;

import java.util.Arrays;

public class MinSubsetSumDifference {
    public static void main(String[] args) {
        int arr[] = {1, 6, 11, 5};
        // DEVIDE THE ARRAY INTO TWO SUBSET SUCH THAT THE DIFFERNCE OF THEIR SUM IS MINIMUM
        // s1 + s2 = sumOfArr  minimise s1 - s2
        // sumOfArr - 2s1 minimise
        int n = arr.length;
        int sumOfArr=0;
        for(int i=0; i<n ; i++){
            sumOfArr= sumOfArr+arr[i];
        }
        boolean dp[][] = targetSum(arr,n,sumOfArr);
        System.out.println(minSum(dp,sumOfArr));
    }
    public static boolean[][] targetSum(int arr[], int n, int sum){
        boolean dp[][]= new boolean[n+1][sum+1];
        for(int i=0 ; i< n+1; i++ ){
            dp[i][0]= true;
        }
        for(int i = 1 ; i< n+1 ; i++){
            for(int j=1; j< sum+1; j++){
                if(arr[i-1]<= j){
                    dp[i][j] = dp[i-1][j-arr[i-1]] || dp[i-1][j];
                }
                else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        return dp ;
    }
    public static int minSum(boolean[][] dp, int sumOfArr){
        int sumMin=0;
        for(int j=0 ; j< dp[0].length/2 ; j++ ){
            if(dp[dp.length-1][j]==true){
                sumMin= Math.min(sumMin,sumOfArr - 2 * j);
            }
        }
        return sumMin;
    }

}
