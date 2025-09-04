package Striver_1_Arrays;

//{1,2,3,1,1,1,4,2,3}
//ans- 3
//{2,0,0,3}
//ans = 3

//Most optimal for the arrays containing negative positve and zeros

import java.util.HashMap;

public class   _8_LongestSubArrayWithSumK {
    public static void main(String[] args) {
        int arr[] = {2,0,0,3};
        int k = 3;
        System.out.println(findSubArray(arr,k));
    }

    public static int findSubArray(int arr[], int k) {
        HashMap<Integer, Integer> preSum = new HashMap<>();
        int sum = 0;
        int maxLen = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            if (sum == k) {
                maxLen = Math.max(maxLen, i + 1);
            }
            if (preSum.containsKey(sum - k)) {
                maxLen = Math.max(maxLen, i - preSum.get(sum - k));
            }
            if (!preSum.containsKey(sum)) {
                preSum.put(sum, i);
            }
        }
        return maxLen;
    }
}

