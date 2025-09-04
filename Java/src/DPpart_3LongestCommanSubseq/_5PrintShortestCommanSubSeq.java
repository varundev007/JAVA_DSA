package DPpart_3LongestCommanSubseq;

public class _5PrintShortestCommanSubSeq {
    public static void main(String[] args) {
        String x= "acbcf";
        String y ="abcdaf";
        int m = x.length();
        int n= y.length();
        int dp[][]=new int[m+1][n+1];
        System.out.println(LSCarray(x,y,m,n,dp));
        printSHortestCommanSubseq(x,y,m,n,dp);
    }
    public static int LSCarray(String x, String y, int m , int n, int dp[][]){
        for(int i=0 ; i<m+1 ; i++){
            dp[i][0]=0;
        }
        for(int j=0 ; j<n+1; j++){
            dp[0][j]=0;
        }
        for(int i=1; i<m+1 ;i++){
            for(int j=1 ; j<n+1 ; j++){
                if(x.charAt(i-1)==y.charAt(j-1)){
                     dp[i][j]= 1+ dp[i-1][j-1];
                }
                else{
                     dp[i][j]= Math.max(dp[i-1][j] , dp[i][j-1]);
                }
            }
        }
        return dp[m][n];
    }
    public static void printSHortestCommanSubseq(String x, String y, int m , int n , int dp[][]){
        int i=m, j=n;
        StringBuilder str = new StringBuilder("");
        while(i>0 || j>0){
            if(x.charAt(i-1) == y.charAt(j-1)){
                str.append(x.charAt(i-1));
                i--;
                j--;
            }
            else{
                if(dp[i][j-1] > dp[i-1][j]){
                    str.append(y.charAt(j-1));
                    j--;
                }
                else{
                    str.append(x.charAt(i-1));
                    i--;
                }
            }
        }
        while(i>0){
            str.append(x.charAt(i-1));
            i--;
        }
        while (j>0){
            str.append(y.charAt(j-1));
            j--;
        }
        System.out.println(str.reverse());
    }
}
