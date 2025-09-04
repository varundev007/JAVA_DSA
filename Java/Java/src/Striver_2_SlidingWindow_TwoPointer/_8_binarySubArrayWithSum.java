package Striver_2_SlidingWindow_TwoPointer;
// {1, 0, 1, 0, 1}, k=2
// it is similar to 'count sub array with sum = k'. but here we will be reducing space complexity
// Logic   =>   answer = count(sub array sum <= k)  -  count(sub array sum <= k-1)
public class _8_binarySubArrayWithSum {
    public static void main(String[] args) {
        int arr[] = {1, 0, 1, 0, 1, 1, 0};
        int k  = 2;
        System.out.println(findSubArrayWithSumLesshthanEqualTo(arr,k) - findSubArrayWithSumLesshthanEqualTo( arr,k-1 ));
    }
    public static int findSubArrayWithSumLesshthanEqualTo(int arr[], int k){
        int l = 0; int count = 0;
        int sum = 0;
        if (k<0) return 0;
        for (int r = 0 ; r < arr.length ; r++){
            sum = sum +arr[r];
            while (sum > k){
                sum = sum - arr[l];
                l++;
            }
            count = count + (r-l+1);
        }
        return count;
    }
}
