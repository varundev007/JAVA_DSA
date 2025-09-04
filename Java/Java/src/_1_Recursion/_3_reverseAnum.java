package _1_Recursion;

public class _3_reverseAnum {
    public static void main(String[] args) {
        int n = 1234321;
        System.out.println(rev(n));
        System.out.println(isPalindrome(n));
    }
    static int sum =0;
    public static int rev(int n){
        if(n==0){
            return 0;
        }
        sum = sum * 10 +n%10;
        rev(n/10);
        return sum;
    }
    public static boolean isPalindrome(int n){
        return n == rev(n);
    }
}
