package _7_leetcode_Top150_Problem._4_MATH;
/*
Example 1:

Input: n = 3
Output: 0
Explanation: 3! = 6, no trailing zero.
Example 2:

Input: n = 5
Output: 1
Explanation: 5! = 120, one trailing zero.
Example 3:

Input: n = 0
Output: 0
 */
public class _4_FactorialTrailingZeroes {
    public static void main(String[] args) {
        int n = 30;
        System.out.println(trailingZeroes(n));
    }
    public static int trailingZeroes(int n) {
        int sum = 0;
        while(Math.floor(n) != 0){
            int i= 1;
            n = (int) (n/Math.pow(5, i));
            sum = (int) (sum + n);
            i++;
        }
        return sum;
    }

}
