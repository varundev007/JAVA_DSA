package DPpart_3LongestCommanSubseq;

public class _6LomgestRepeatingSubSeq {
    public static void main(String[] args) {
        String x ="aabebcdd";
        String y="aabebcdd";
        int m= x.length();
        int n =y.length();
        System.out.println(longestRepeatingSubSeq(x,y,m,n));
        //Q: X is given we need to find longest non repeating sub seq
        //code is same as lsc just one more condition is added
    }
    public static int longestRepeatingSubSeq(String x, String y, int m, int n){
        int dp[][]= new int[m+1][n+1];
        for(int i =0 ;i<m+1 ; i++){
            dp[i][0]= 0;
        }
        for(int j=0 ; j<n+1 ;j++){
            dp[0][j]=0;
        }
        for(int i=1 ; i <m+1;i++){
            for(int j=1 ; j<n+1 ; j++){
                if(x.charAt(i-1) == y.charAt(j-1) && i!=j){
                    dp[i][j]= dp[i-1][j-1]+1;
                }
                else{
                    dp[i][j] = Math.max(dp[i-1][j] , dp[i][j-1]);
                }
            }
        }
        return dp[m][n];
    }
}
