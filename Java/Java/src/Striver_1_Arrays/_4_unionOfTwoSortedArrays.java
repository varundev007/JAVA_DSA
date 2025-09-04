package Striver_1_Arrays;

import java.util.ArrayList;

public class _4_unionOfTwoSortedArrays {
    public static void main(String[] args) {
        int arr1[] = {1,2,3,4,5};
        int arr2[] = {3,4,4,6,7};
        //o/p = 1.2,3,4,5,6,7
        int i=0,j=0;
        ArrayList<Integer> res= new ArrayList<>();
        while (i<arr1.length && j<arr2.length){
            if (arr1[i] < arr2[j]){
                if (res.size()==0 ||  !res.contains(arr1[i])){
                    res.add(arr1[i]);
                }
                i++;
            }
            else {
                if (!res.contains(arr2[j]) || res.size()==0){
                    res.add(arr2[j]);
                }
                j++;
            }
        }
        while(i< arr1.length){
            res.add(arr1[i]);
            i++;
        }
        while(j< arr2.length){
            res.add(arr2[j]);
            j++;
        }
        System.out.println(res);
    }

}