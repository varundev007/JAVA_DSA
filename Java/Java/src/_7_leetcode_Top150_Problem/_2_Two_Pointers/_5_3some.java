package _7_leetcode_Top150_Problem._2_Two_Pointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class _5_3some {
    public static void main(String[] args) {
        int[] nums= {-1,0,1,2,-1,-4};
        System.out.println(threeSum(nums));

    }
    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        HashSet<List<Integer>> result = new HashSet<>();
        for (int i = 0 ; i< nums.length-2 ; i++){
            int left = i+1;
            int right = nums.length-1;
            while (right > left){
                int sum = nums[i] +nums[left] + nums[right];
                if(sum == 0){
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;
                }
                else if (sum< 0){
                    left++;
                }
                else {
                    right--;
                }
            }
        }
        return new ArrayList<> (result);
    }
}
