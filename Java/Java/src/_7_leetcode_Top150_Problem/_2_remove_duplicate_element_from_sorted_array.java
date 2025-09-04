package _7_leetcode_Top150_Problem;

// Remove Duplicates from Sorted Array

import java.util.ArrayList;
import java.util.LinkedHashMap;

public class  _2_remove_duplicate_element_from_sorted_array {
    public static void main(String[] args) {
        int nums[] ={0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nums));
    }
    public static int removeDuplicates(int[] nums) {
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
        for(int i = 0 ; i< nums.length ; i++){
            map.put(nums[i],1);
        }
        ArrayList<Integer> arr = new ArrayList<>();
        for( Integer x : map.keySet()){
            arr.add(x);
        }
        System.out.println(arr);
        return arr.size();
    }
}
