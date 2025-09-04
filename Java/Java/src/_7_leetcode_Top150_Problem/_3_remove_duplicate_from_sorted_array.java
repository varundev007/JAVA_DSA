package _7_leetcode_Top150_Problem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;

/*
 Remove Duplicates from Sorted Array II

 Given an integer array nums sorted in non-decreasing order,
 remove some duplicates in-place such that each unique element appears at most twice.
 The relative order of the elements should be kept the same.
 Since it is impossible to change the length of the array in some languages,
 you must instead have the result be placed in the first part of the array nums.
 More formally, if there are k elements after removing the duplicates,
 then the first k elements of nums should hold the final result. It does not matter what you leave beyond the first k elements.

Return k after placing the final result in the first k slots of nums.

Example 1:

Input: nums = [1,1,1,2,2,3]
Output: 5, nums = [1,1,2,2,3,_]
Explanation: Your function should return k = 5, with the first five elements of nums being 1, 1, 2, 2 and 3 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).
Example 2:

Input: nums = [0,0,1,1,1,1,2,3,3]
Output: 7, nums = [0,0,1,1,2,3,3,_,_]
Explanation: Your function should return k = 7, with the first seven elements of nums being 0, 0, 1, 1, 2, 3 and 3 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).
 */
public class _3_remove_duplicate_from_sorted_array {
    public static void main(String[] args) {
        int num[] = {1,1,1,2,2,3};
        System.out.println(removeDuplicates(num));
    }
    public static int removeDuplicates(int[] arr) {
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
        for(int i = 0 ; i< arr.length ; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i]) + 1 );
            }
            else {
                map.put(arr[i] , 1);
            }
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for(Integer x : map.keySet()){
            if(map.get(x) >= 2){
                for(int j=0 ; j<2 ; j++){
                    ans.add(x);
                }
            }
            else {
                ans.add(x);
            }
        }
        System.out.println(ans);
        return ans.size();

    }


}
