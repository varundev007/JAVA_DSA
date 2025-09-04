package _7_leetcode_Top150_Problem._3_hashmaps;

import java.util.*;

/*
Example 1:

Input: nums = [100,4,200,1,3,2]
Output: 4
Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.
Example 2:

Input: nums = [0,3,7,2,5,8,4,6,0,1]
Output: 9
 */
public class _9_LongestConsecutiveSequence {
    public static void main(String[] args) {
        int[] nums ={0,0};
        System.out.println(longestConsecutive(nums));
    }
    public static int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int i= 0 ; i< nums.length ; i++){
            set.add(nums[i]);
        }
        ArrayList<Integer> uniQnum = new ArrayList<>();
        for (Integer x : set){
            uniQnum.add(x);
        }
        Collections.sort(uniQnum);
        System.out.println(uniQnum);
       // System.out.println(uniQnum);
        if (uniQnum.size() ==0 || uniQnum.size() ==1){
            return uniQnum.size();
        }
     //   System.out.println(Arrays.toString(nums));
        int count = 1;
        ArrayList<Integer> len = new ArrayList<>();
        for (int i = 0 ; i<uniQnum.size()-1 ; i++){
            if (uniQnum.get(i) == (uniQnum.get(i+1) - 1)){
                count= count +1;
                if (i == uniQnum.size()-2){
                    len.add(count);
                }
            }
            else {
                len.add(count);
                count =1 ;
            }
        }
    //    System.out.println(len);
        Collections.sort(len);
        System.out.println(len);

        return len.get(len.size()-1);
    }
}
