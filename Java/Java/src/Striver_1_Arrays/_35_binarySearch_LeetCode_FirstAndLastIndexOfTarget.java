package Striver_1_Arrays;

import java.util.Arrays;

public class _35_binarySearch_LeetCode_FirstAndLastIndexOfTarget {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,4,4,5,5,6};
        int target = 4;
        int ans[] = {-1 , -1};
        ans[0]= findFirstOccur(arr, target, true);
        ans[1]= findFirstOccur(arr, target, false);
        System.out.println(Arrays.toString(ans));
    }
    public  static int findFirstOccur(int arr[], int target, boolean isFirst){
        int start = 0;
        int end = arr.length - 1;
        int ans=0;
        while (start <= end){
            int mid = start + (end - start)/2 ;
            if (arr[mid] == target){
                ans = mid;
                if (isFirst){
                    end= mid -1;
                }
                else {
                    start=mid+1;
                }
            }
            else if (target > arr[mid]){
                start = mid + 1;
            }
            else {
                end = mid -1;
            }
        }
        return ans;
    }
}
