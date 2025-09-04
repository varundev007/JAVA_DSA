package DPpart_3LongestCommanSubseq;

public class _7SequencePatternMatching {
    public static void main(String[] args) {
        //Q:Given string x,y return t if x seq of x is matching seq of y
        String x="axy";
        String y= "adxcpy";
        //Approch:we will find length of lsc between two anf if lenght of lsc is equal to length of any of the x,y then answer is true
        int m = x.length();
        int n = y.length();
        int lenLSC= LSClenght(x,y,m,n);
        if(lenLSC == m || lenLSC==n){
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }

    }
    public static int LSClenght(String x, String y, int m , int n){
        int dp[][] = new int[m+1][n+1];
        for(int i=0; i<m+1 ;i++){
            dp[i][0]=0;
        }
        for(int j=0; j<n+1 ;j++){
            dp[0][j]=0;
        }
        for(int i=1;i<m+1 ;i++){
            for(int j=1 ; j<n+1 ;j++ ){
                if(x.charAt(i-1)==y.charAt(j-1)){
                    dp[i][j]=1+dp[i-1][j-1];
                }
                else{
                    dp[i][j]= Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }

        }
        return dp[m][n];
    }
}
