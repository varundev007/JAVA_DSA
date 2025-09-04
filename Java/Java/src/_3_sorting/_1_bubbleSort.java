package _3_sorting;

import java.util.Arrays;

public class _1_bubbleSort {

    //bigger element willbe thrown at last index

    //time complexity - O(N^2)
    public static void main(String[] args) {
        int arr[]= {6,7,2,5,9};
        int n =arr.length;
        for (int i = 0 ; i < (n-1) ; i++){
            for (int j = 0 ; j < (n-1-i) ; j++){
                if (arr[j] > arr[j+1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
