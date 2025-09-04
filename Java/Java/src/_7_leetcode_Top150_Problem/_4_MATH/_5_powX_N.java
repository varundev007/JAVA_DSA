package _7_leetcode_Top150_Problem._4_MATH;
/*
Example 1:

Input: x = 2.00000, n = 10
Output: 1024.00000
Example 2:

Input: x = 2.10000, n = 3
Output: 9.26100
Example 3:

Input: x = 2.00000, n = -2
Output: 0.25000
Explanation: 2-2 = 1/22 = 1/4 = 0.25

 */
public class _5_powX_N {
    public static void main(String[] args) {
        double ans = myPow(2, -2);
        System.out.println(ans);
    }
    public static double myPow(double x, int n) {
        if (n==0){
            return 1;
        }
        if(x==1){
            return 1;
        }
        double pow =1;
        if (n>0){
            for (int i =0 ; i<n ; i++){
                pow = pow * x;
            }
        }
        if (n<0){
            for (int i =0 ; i<Math.abs(n) ; i++){
                pow = pow * 1/x;
            }
        }
        return pow;
    }
}
