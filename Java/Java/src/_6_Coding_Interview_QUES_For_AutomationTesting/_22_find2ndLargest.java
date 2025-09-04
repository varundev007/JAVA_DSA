package _6_Coding_Interview_QUES_For_AutomationTesting;

import java.util.Arrays;

public class _22_find2ndLargest {
    public static void main(String[] args) {
        int arr[] = {1, 4, 2, 7, 7,5, 7};
        System.out.println(method1(arr));
    }
    public static int method1(int arr[]){
        int largest = 0 ;
        int secondL = -1;
        for (int i = 0; i< arr.length ; i++){
            if (arr[i] > largest){
                secondL= largest;
                largest =  arr[i];
            }
            else {
                if (arr[i] < largest && arr[i] > secondL){
                    secondL= arr[i];
                }
            }

        }
        return secondL;
    }
}
