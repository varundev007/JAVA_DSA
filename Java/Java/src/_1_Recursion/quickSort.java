package _1_Recursion;

import java.util.Arrays;
// Logic is to move pivot element at correct position
//Time complexity - O(N LogN)
//Space complexity - O(1) (Ignoring stack space)
public class quickSort {
    public static void main(String[] args) {
        int arr[]={12,8,9,10,5,7};
        sort(arr,0, arr.length-1);
        System.out.println(Arrays.toString(arr));

    }
    public static void sort(int[] arr, int lo, int hi){
        if (lo >= hi){
            return;
        }
        int i = lo;
        int j = hi;
        int m = (i+j)/2;
        int pivot = arr[m];
        while (i<=j){
            while (arr[i] < pivot){
                i++;
            }
            while (arr[j] > pivot){
                j--;
            }
            if (i<=j){
                //swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        sort(arr, lo, j);
        sort(arr, i , hi);
    }
}
