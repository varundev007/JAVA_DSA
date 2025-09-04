package Striver_2_SlidingWindow_TwoPointer;//Find max sum 4 concesutive indexs of array should be at ends
// 6,2,3,4 = 15
// 6,2,3,1 = 12
// 6,2,7,1 = 16
// 6,1,7,1 = 15
// 2,1,7,1 = 11
//Maxsum = 16

public class _1_MaxSumForKconsecutiveNum {
    public static void main(String[] args) {
        int arr[] = {6,2,3,4,7,2,1,7,1};
        int k = 4;
        System.out.println(findMaxSum(arr, k));
    }
    public static int findMaxSum(int arr[], int k){
        int leftSum= 0;
        int rightSum = 0;
        int maxSum =0;
        for (int i =0 ; i<k ;i++){
            leftSum = leftSum + arr[i];
        }
        int n = arr.length;
        int rightIndex = n-1;
        for (int i = k-1 ; i>=0 ; i--){
            leftSum =leftSum - arr[i];
            rightSum = rightSum + arr[rightIndex];
            rightIndex--;
            maxSum = Math.max(maxSum , (leftSum + rightSum));
        }
        return maxSum;
    }
}
