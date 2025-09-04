package Striver_1_Arrays;

import java.util.Arrays;

public class _3_moveAllZerosToTheEnd {
    public static void main(String[] args) {
        int arr[]= {1,2,0,4,0,6,0,7,8,9};
        int j=-1;
        for (int i=0; i< arr.length;i++){
            if (arr[i] == 0){
                j=i;
                break;
            }
        }
        for(int i=j+1; i< arr.length; i++){
            if (arr[i]!=0){
                swap(arr,j,i);
                j=j+1;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void swap(int arr[], int index1, int index2){
        int temp = arr[index1];
        arr[index1]= arr[index2];
        arr[index2]=temp;
    }
}
