package _7_leetcode_Top150_Problem._4_MATH;

public class _3_SqrtX {
    public static void main(String[] args) {
        System.out.println(mySqrt(50));
    }
    public static int mySqrt(int x) {
        int ans = 0;
        for (int i = 0 ; i<= x ; i++){
            if( i * i <= x){
                ans = i;
            }
            else {
                break;
            }
        }
        return ans;
    }
}
