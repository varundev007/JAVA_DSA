package _7_leetcode_Top150_Problem._4_MATH;

public class _1_plaindrome {
    public static void main(String[] args) {
        int x= 122;
        System.out.println(isPalindrome(x));
    }
    public static boolean isPalindrome(int x) {
        String s = String.valueOf(x);
        int i = 0;
        int j = s.length()-1;
        while(j>i){
            if (s.charAt(i) == s.charAt(j)){
                i++;j--;
            }
            else {
                return false;
            }
        }
        return true;
    }
}
