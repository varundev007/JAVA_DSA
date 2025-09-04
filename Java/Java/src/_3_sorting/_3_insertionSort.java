package _3_sorting;

import java.util.Arrays;

public class _3_insertionSort {

    public static void main(String[] args) {
        int arr[] = {5,4,7,9,2};

        for(int i=1 ; i<arr.length ; i++){//loop starting from unsorted part
            int curr = arr[i];
            int j= i-1;  // j -> last index of sorted array
            while(j>=0 && curr < arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1]=curr;
        }
        System.out.println(Arrays.toString(arr));
    }
}
