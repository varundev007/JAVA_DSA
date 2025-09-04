package _6_Coding_Interview_QUES_For_AutomationTesting;

import java.util.Arrays;

public class _23_swaping_values_in_arrays {
    public static void main(String[] args) {
        int arr[] = {4,5,6,7,8,9};
       // swap(arr, 2, 5);
        reverseArray(arr);
    }
    static void swap(int arr[], int index1, int index2){
        int temp = arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
       // System.out.println(Arrays.toString(arr));
    }
    //Reverse an array
    static void reverseArray(int arr[]){
        for (int i = 0 ; i< arr.length/2 ; i++){
            swap(arr, i, arr.length-1-i);
        }
        System.out.println(Arrays.toString(arr));
    }
}
