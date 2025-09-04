package DPpart_3LongestCommanSubseq;

public class _4LargestCommanSubStr {
    public static void main(String[] args) {
        String x= "abcde";
        String y = "abfce";
        //Find largest comman sub string
//        ab-> length 2 ---->answer
        int m = x.length();
        int n = y.length();
        int dp[][]= new int[m+1][n+1];
        System.out.println(LCsubStr(x,y,m,n,dp));
    }
    public static int LCsubStr(String x, String y , int m , int n, int dp[][]){
        //initialization
        for(int i=0 ; i < m+1; i++){
            dp[i][0]=0;
        }
        for(int j=0 ; j< n+1 ; j++){
            dp[0][j]=0;
        }
        for(int i=1; i<m+1 ;i++){
            for(int j=1 ; j< n+1; j++){
                if(x.charAt(m-1)==y.charAt(n-1)){
                    dp[i][j] = 1+dp[m-1][n-1];
                }
                else{
                    dp[i][j] = 0;
                }
            }
        }
        return dp[m][n];
    }
    //To print the maximum sub suquence

    public static void printSubseq(String x, String y, int m, int n,int dp[][]){
        int i=m;
        int j=n;
        String str="";
        while(i>0 || j>0){
            if(x.charAt(i-1)==y.charAt(j-1)){
                str= str + x.charAt(i-1);
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
        System.out.println(str);
    }
}
