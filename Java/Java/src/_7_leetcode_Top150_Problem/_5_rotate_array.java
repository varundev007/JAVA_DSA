package _7_leetcode_Top150_Problem;

import java.util.Arrays;
/*
Example 1:
Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]

Example 2:
Input: nums = [-1,-100,3,99], k = 2
Output: [3,99,-1,-100]
Explanation:
rotate 1 steps to the right: [99,-1,-100,3]
rotate 2 steps to the right: [3,99,-1,-100]
 */
public class _5_rotate_array {
    public static void main(String[] args) {

        int arr[] = {1,2,3,4,5,6,7};
        int k = 2;
        rotateArray(arr, k);
    }

    public static void rotateArray(int arr[],  int k) {
        int ans[] = new int[arr.length];
        int j =0 ;
        for (int i = arr.length - k;i < arr.length; i++) {
            ans[j] = arr[i];
            j++;
        }
        int x=0;
        while (x < arr.length - k){
            ans[j] = arr[x];
            x++;
            j++;
        }
        System.out.println(Arrays.toString(ans));
    }
}
