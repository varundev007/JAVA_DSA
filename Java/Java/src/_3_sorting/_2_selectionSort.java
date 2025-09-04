package _3_sorting;

import java.util.Arrays;

public class _2_selectionSort {
    //smallest index nikal se value ko i th index sete swap kr dege

    public static void main(String[] args) {
        int arr[] = {5,4,6,8,7};

        for (int i=0 ; i<arr.length ; i++){
            int smallest = i;
            for (int j=i ; j<arr.length ; j++){
                if(arr[j] < arr[smallest]){
                    smallest =j;
                }
            }
            //swap smallest <=> arr[i]
            int temp = arr[i];
            arr[i] = arr[smallest];
            arr[smallest]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }


}
