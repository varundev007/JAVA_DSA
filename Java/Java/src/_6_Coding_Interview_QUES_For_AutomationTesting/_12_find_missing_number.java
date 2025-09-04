package _6_Coding_Interview_QUES_For_AutomationTesting;

import java.util.Arrays;

public class _12_find_missing_number {

    //Find Missing Number In Array

    public static void main(String[] args) {
        int arr[] ={1,2,3,4,5,7,8,9,10};
        findMissing(arr);
    }
    public static void findMissing(int arr[]){
        int sumArr = 0;
        int sumExpected = 0;
        for(int i = 0 ; i < arr.length ; i++ ){
            sumArr = sumArr + arr[i];
        }

        for (int i =1 ; i<= 10; i++){
            sumExpected = sumExpected + i;
        }

        System.out.println(Arrays.toString(arr));
        System.out.println("The missing number is " + (sumExpected-sumArr));
    }
}
