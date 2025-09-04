package Striver_1_Arrays;

import java.util.Arrays;

//       {1, 3, 5, 7} {0,2,6,8,9}
//ans -> {0, 1, 2, 3} {5,6,7,8,9}
// right arr ke mins iss taraf left arr ke max uss taraf
public class _29_sortTeoSortedArraysWithoutUsingExtraSpace {
    public static void main(String[] args) {
        int arr1[]= {1, 3, 5, 7};
        int arr2[] = {0,2,6,8,9};
        int left = arr1.length-1;
        int right = 0;
        while (left>=0 && right<arr2.length){
            if (arr1[left] > arr2[right]){
                //swap
                int temp = arr1[left];
                arr1[left] = arr2[right];
                arr2[right] = temp;
                left--;right++;
            }
            else {
                break;
            }
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr1) + " " + Arrays.toString(arr2));
    }
}
