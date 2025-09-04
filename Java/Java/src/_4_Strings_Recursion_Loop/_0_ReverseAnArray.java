package _4_Strings_Recursion_Loop;

import java.util.Arrays;

public class _0_ReverseAnArray {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6,7};
        int[] ans = reverse(arr);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] reverse(int arr[]){
        int i = 0 , j = arr.length-1;
        while(i<=j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j]= temp;
            i++; j--;
        }
        return arr;
    }
}
