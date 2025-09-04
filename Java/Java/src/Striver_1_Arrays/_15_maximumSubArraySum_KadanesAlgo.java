package Striver_1_Arrays;

public class _15_maximumSubArraySum_KadanesAlgo {
    public static void main(String[] args) {
        int arr[] =  {-2,-3,4,-1,-2,1,5};
        int sum=0 ; int maxSum = Integer.MIN_VALUE;

        for (int i = 0 ; i < arr.length ; i++){
            sum = sum + arr[i];
            maxSum = Math.max(maxSum, sum);
            if (sum < 0 ){
                sum =0;
            }
        }
        System.out.println(maxSum);
    }
}
