package DPpart_3LongestCommanSubseq;

public class _3LCStabulation {
    public static void main(String[] args) {
        //FIND LENGTH OF LARGEST SUBSEQ
        String x= "acbcf";
        String y= "abcdaf";
        //LARGEST COMMAN SUBSEQ = ABDH => 4 ANSWER
        int m= x.length();
        int n= y.length();
        int dp[][]=new int[m+1][n+1];
        System.out.println(tabulatn(x,y,m,n,dp));
        printSubseq(x,y,m, n, dp);
        // question1: FOR FINDING LENGTH OF SHORTEST COMMAN SUPERSEQ
        // A: AGGTAB , B: GXTXAYB
        // ANS- AGGXTXAYB-> 9 ANSWER
        // SOLUTION: M+N - LENGTH(LSC)= 7+6-4

        // question2: Find min number insertion and deletio to convert string a to b
        // a: heap   b:pea
        // solution: No of deletion to convet string a to lsc is len(heap) - len(pea)
        //           no of insertion to convert convert string lsc to b - len(b) - len(LSC)
    }
    public static int tabulatn(String x,  String y, int m , int n, int dp[][]){

        for(int i=0; i<m+1; i++){
            dp[i][0]=0;
        }
        for(int j=0 ; j<n+1 ; j++){
            dp[0][j]=0;
        }
        for(int i=1 ; i< m+1; i++){
            for(int j =1 ; j<n+1 ;j++){
                if(x.charAt(i-1)==y.charAt(j-1)){
                    dp[i][j]=1+ dp[i-1][j-1];
                }
                else{
                    dp[i][j]= Math.max(dp[i][j-1], dp[i-1][j]);
                }
            }
        }
        return dp[m][n];
    }
    public static void printSubseq(String x, String y, int m, int n,int dp[][]){
        int i=m;
        int j=n;
        StringBuilder str= new StringBuilder("");
        while(i>0 || j>0){
            if(x.charAt(i-1)==y.charAt(j-1)){
                str= str.append(x.charAt(i-1))  ;
                i--;
                j--;
            }
            else {
                if(dp[i][j-1] > dp[i-1][j]){
                    j--;
                }
                else{
                    i--;
                }
            }
        }
        System.out.println(str.reverse());
    }
}
