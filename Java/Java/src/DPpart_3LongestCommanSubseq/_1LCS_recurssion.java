package DPpart_3LongestCommanSubseq;

public class _1LCS_recurssion {
    public static void main(String[] args) {
        //FIND LENGTH OF LARGEST SUBSEQ
        String x= "abcdhf";
        String y= "abedfhr";
        //LARGEST COMMAN SUBSEQ = ABDH => 4 ANSWER
        int n= x.length();
        int m= y.length();
        System.out.println(findLsc(x,y,n,m));
    }
    public static int findLsc(String x, String y, int n , int m){
        if(n==0 || m==0){
            return 0;
        }
        if(x.charAt(n-1)==y.charAt(m-1)){
            return 1+ findLsc(x,y,n-1,m-1);
        }
        else{
            return Math.max(findLsc(x,y,n,m-1), findLsc(x,y,n-1,m));
        }
    }

}
