package Striver_1_Arrays;

import java.util.Arrays;

// {2,4,5,7,8} => {4,5,7,8,2}
public class _1_LeftRotateArrayByOne {
    public static void main(String[] args) {
        int arr[] = {2, 4, 5, 7, 8};
        int temp = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = temp;
        System.out.println(Arrays.toString(arr));
    }
}
