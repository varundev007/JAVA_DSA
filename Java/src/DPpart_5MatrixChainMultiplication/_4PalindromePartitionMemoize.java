package DPpart_5MatrixChainMultiplication;

import java.util.Arrays;

public class _4PalindromePartitionMemoize {
    public static void main(String[] args) {
        String s = "nitik";
        int n = s.length();
        int dp[][] = new int[n][n];
        for(int i=0; i<n; i++){
            Arrays.fill(dp[i], -1);
        }
        System.out.println(palindromePartition(s,0,n-1,dp));
    }
    public static boolean isPalindrome(String s, int i, int j){
        if(i>=j){
            return true;
        }
        else {
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static int palindromePartition(String s, int i, int j, int dp[][]){
        int ans = Integer.MAX_VALUE;
        if(dp[i][j] != -1){
            return dp[i][j];
        }
        if(i>=j){
            return 0;
        }
        if(isPalindrome(s, i, j)){
            return 0;
        }
        for(int k=i; k<=j-1; k++){
            ans= Math.min(ans, palindromePartition(s, i, k, dp) + palindromePartition(s, k+1, j, dp) + 1);
        }
        return dp[i][j]=ans;
    }
}
