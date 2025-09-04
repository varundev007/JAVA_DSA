package _7_leetcode_Top150_Problem._4_MATH;

import java.util.Arrays;

public class _2_plusOne {
    public static void main(String[] args) {
        int digits[] = {1,2,3}; // [4,9,9]  , [9,9,9,9]

      int ans[] = plusOne(digits);
      System.out.println(Arrays.toString(ans));;
    }
    public static int[] plusOne(int[] digits) {
        int n = digits.length;
        for (int i = n - 1 ; i>=0 ; i--){
            if(digits[i] != 9){
                digits[i] = digits[i] +1;
                break;
            }
            else {
                digits[i] = 0;
            }
        }
        if (digits[0] == 0){
            int[] res = new int[n+1];
            res[0] =1;
            return res;
        }
        return digits;
    }
}
