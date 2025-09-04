package DPpart_5MatrixChainMultiplication;

import java.util.Arrays;

public class _5PalindromePartitionMemo_optimized {
    public static void main(String[] args) {
        String s = "nitik";
        int n = s.length();
        int dp[][] = new int[n][n];
        for(int i = 0; i<n; i++){
            Arrays.fill(dp[i], -1);
        }
        System.out.println(palindromePartiion(s,0,n-1,dp));
    }
    public static boolean isPalindrome(String s, int i, int j){
        if(i>=j){
            return true;
        }
        else{
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static int palindromePartiion(String s, int i, int j, int dp[][]){
        int ans = Integer.MAX_VALUE;
        int ans1, ans2;
        if(i>=j){
            return 0;
        }
        if(isPalindrome(s, i, j)){
            return 0;
        }
        if(dp[i][j] != -1){
            return dp[i][j];
        }
        for(int k=i; k<=j-1; k++){
            if(dp[i][k] != -1){
                ans1 = dp[i][k];
            }
            else {
                ans1= palindromePartiion(s, i, k ,dp);
                dp[i][k] = ans1;
            }
            if(dp[k+1][j]!=-1){
                ans2 = dp[k+1][j];
            }
            else{
                ans2 = palindromePartiion(s,k+1, j, dp);
                dp[k+1][j] = ans2;
            }
            ans = Math.min(ans, ans1 + ans2 +1);
        }
        return dp[i][j]=ans;
    }
}
