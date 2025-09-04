package _2_RecurssionInArray;

import java.lang.reflect.Array;
import java.util.Arrays;
// time complexity - O(N.log(N))
public class _5_mergeSort {
    public static void main(String[] args) {
        int arr[] =  {4,6,2,5,3,9,7,8};
        int ans[] = mergeSort(arr);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] mergeSort(int arr[]){
        if(arr.length == 1){
            return arr;
        }
        int m = arr.length/2 ;
        int left[] = mergeSort(Arrays.copyOfRange(arr, 0 ,m));
        int right[] = mergeSort(Arrays.copyOfRange(arr, m , arr.length));
        return merge(left,right);
    }
    public static int[] merge(int[] left, int[] right){
        int mix[] = new int[left.length + right.length];
        int k=0,i=0,j=0;
        while (i< left.length && j< right.length){
            if(left[i] < right[j]){
                mix[k] = left[i];
                i++;
                k++;
            }
            else {
                mix[k] = right[j];
                j++;
                k++;
            }
        }
        // if one array is bigger then other array
        while (i< left.length){
            mix[k] = left[i];
            i++;
            k++;
        }

        while(j< right.length){
            mix[k] = right[j];
            j++;
            k++;
        }
        return mix;
    }
}
