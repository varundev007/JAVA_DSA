package _1_Recursion;

import java.lang.reflect.Array;
import java.util.Arrays;

public class mergeSort {
    public static void main(String[] args) {
        int arr[]= {6,5,2,7,8};
        arr =MergeSort(arr);
        System.out.println(Arrays.toString(arr));

    }
    public static int[] MergeSort(int arr[]){
        if (arr.length <= 1) {
            return arr;
        }
        int mid = arr.length/2;
        int left[] = MergeSort(Arrays.copyOfRange(arr,0,mid));
        int right[] = MergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return Merge(left, right);
    }
    public static int[] Merge(int left[] , int[] right){
        int mix[] = new int[left.length + right.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i< left.length && j< right.length){
            if (left[i] < right[j]){
                mix[k] =left[i];
                i++;k++;
            }
            else {
                mix[k] = right[j];
                j++;k++;
            }
        }
        while (i< left.length){
            mix[k] = left[i];
            i++;k++;
        }
        while(j < right.length){
            mix[k] = right[j];
            j++; k++;
        }
        return mix;
    }
}
