package DPpart_5MatrixChainMultiplication;

public class _3PalindromePartitioningRecursive {
    public static void main(String[] args) {
        String s= "nitik";
        //MIn number of partition required to make the each string palindrome
        System.out.println(palindromPartition(s, 0, s.length()-1));
    }
    public static boolean isPalindrom(String s, int i, int j){
        if(i>=j){
            return true;
        }
        else{
            while(i < j){
                if(s.charAt(i) != s.charAt(j)){
                    return false;
                }
                i++;
                j--;
            }
        }
        return true;
    }
    public static int palindromPartition(String s, int i , int j){
        int ans = Integer.MAX_VALUE;
        if(i>=j){
            return 0;
        }
        if(isPalindrom(s, i, j)){
            return 0;
        }
        for(int k = i ; k<=j-1 ; k++){
            ans = Math.min(ans, palindromPartition(s, i, k ) + palindromPartition(s, k+1, j) + 1);
        }
        return ans;
    }
}
