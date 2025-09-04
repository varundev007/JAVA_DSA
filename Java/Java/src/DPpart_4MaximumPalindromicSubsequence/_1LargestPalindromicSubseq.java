package DPpart_4MaximumPalindromicSubsequence;

public class _1LargestPalindromicSubseq {
    public static void main(String[] args) {
        String s = "agbcba";
        // Given string we need length of largest palindromic subseq
        // hint: we need to find lsc between given string and reverse string
        StringBuilder str= new StringBuilder(s);
        str.reverse();
        int m= s.length();
        int n= str.length();
        System.out.println(findLSC(s,str,m,n));
        //Variatiob question 1
        //Given string s: agbcba, find min no of deletion to in string s to make palindrome
        //Soln; 1st find length of largest palindrome , answer is lenght(s) - lrngth(lsc palindrome)

        //Variation question 2
        // Given string s:, find minimum number of insertion in a string s to make palindrome
        // Soln: Answer is same as min of deletion,as it will atke same number of insertion to make palindromic pair
    }
    public static int findLSC(String s, StringBuilder str, int m, int n ){
        int dp[][] = new int[m+1][n+1];
        for(int i= 0 ; i< m+1 ; i++){
            dp[i][0]= 0;
        }
        for (int j=0; j< n+1 ; j++){
            dp[0][j]=0;
        }
        for(int i=1; i<m+1 ; i++){
            for(int j=1; j<n+1 ;j++){
                if(s.charAt(i-1) == str.charAt(j-1)){
                    dp[i][j]= 1+ dp[i-1][j-1];
                }
                else{
                    dp[i][j] = Math.max(dp[i][j-1] , dp[i-1][j]);
                }
            }
        }
        return dp[m][n];
    }
}
