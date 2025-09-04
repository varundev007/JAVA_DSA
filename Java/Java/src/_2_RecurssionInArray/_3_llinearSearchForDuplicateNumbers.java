package _2_RecurssionInArray;

import java.util.ArrayList;

public class _3_llinearSearchForDuplicateNumbers {
    public static void main(String[] args) {
        int arr[] = {2,5,4,6,4};
        int target = 4;
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(findIdx(arr, 0 , target , list));
    }
    public static ArrayList<Integer> findIdx(int arr[], int idx, int target , ArrayList<Integer> list){
        if(idx == arr.length){
            return list;
        }
        if(arr[idx] == target){
            list.add(idx);
        }
        return findIdx(arr,idx+1, target,list);
    }

}
