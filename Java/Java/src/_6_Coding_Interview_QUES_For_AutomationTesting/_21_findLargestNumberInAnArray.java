package _6_Coding_Interview_QUES_For_AutomationTesting;

import java.util.Arrays;

public class _21_findLargestNumberInAnArray {
    public static void main(String[] args) {
        int arr[] = {1, 4, 2, 7, 7, 5};
        System.out.println(method3(arr));
    }
    public static int method1(int arr[]){
        Arrays.sort(arr);
        return arr[arr.length-1];
    }
    public static int method2(int arr[]){
        int largest = arr[0];
        for (int i =1 ; i< arr.length ; i++){
            if (arr[i] > largest){
                largest= arr[i];
            }
        }
        return largest;
    }
    public static int method3(int arr[]){
        int largest = Integer.MIN_VALUE;
        for (int i =0 ; i< arr.length ; i++){
            largest = Math.max(arr[i] , largest);
        }
        return largest;
    }
}
