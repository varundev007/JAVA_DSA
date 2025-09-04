package _7_leetcode_Top150_Problem._3_hashmaps;

import java.util.HashMap;
import java.util.HashSet;

public class _7_ContainsDuplicateII {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1,2,3};
        int k = 2;
        System.out.println(containsNearbyDuplicate(nums, k));
    }
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        if (k < 1){
            return false;
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0 ; i< nums.length ; i++){
            if (map.containsKey(nums[i])){
                if (i - map.get(nums[i]) <= k){
                    return true;
                }
                else {
                    map.put(nums[i] , i);
                }
            }
            else {
                map.put(nums[i] , i);
            }
        }
        return false;
    }
}
