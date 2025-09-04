package Striver_1_Arrays;

import java.util.Arrays;

public class _12_sort0s1s2s {
    public static void main(String[] args) {
        int arr[] = {0,1,2,0,0,1,2,1,0};
        dutchNationalFlagAlgo(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void dutchNationalFlagAlgo(int arr[]){
        int low=0;
        int mid=0;
        int high= arr.length-1;
        while(mid<=high){
            if (arr[mid]==0){
                swap(arr,mid, low);
                mid++;
                low++;
            } else if (arr[mid] == 1) {
                mid++;
            }
            else {
                swap(arr,mid,high);
                high--;
            }
        }
    }
    public static void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i]= arr[j];
        arr[j] = temp;
    }
}
