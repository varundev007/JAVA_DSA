package Striver_1_Arrays;

import java.util.Arrays;

public class _22_RotateArrayBy90Degree {
    public static void main(String[] args) {
        int arr[][] = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10,11,12},
                {13,14,15,16}
        };
        rotateArray(arr);
    }
    public static void rotateArray(int arr[][]){
        transpose(arr);
        //reversing row wise
        reverse(arr);
    }
    public static void transpose(int arr[][]){
        for (int i =0 ; i< arr.length; i++){
            for (int j=0 ;j < i ; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        System.out.println(Arrays.deepToString(arr));
    }
    public static void reverse(int arr[][]){
        for (int i =0 ; i < arr.length ; i++){
            for (int j =0; j<arr[0].length/2 ; j++ ){
                int temp = arr[i][j];
                arr[i][j] = arr[i][arr[i].length-1-j];
                arr[i][arr[i].length-1-j]= temp;
            }
        }
        System.out.println(Arrays.deepToString(arr));
    }
}
