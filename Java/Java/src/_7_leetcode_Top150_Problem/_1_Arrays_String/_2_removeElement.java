package _7_leetcode_Top150_Problem._1_Arrays_String;

public class _2_removeElement {
    public static void main(String[] args) {
        int nums[]= {3,2,2,3};
        int val = 3;
        System.out.println(removeElement(nums, val));
    }
    public static int removeElement(int[] nums, int val) {
        int start = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != val) {
                nums[start] = nums[i];
                start++;
            }
        }

        return start ;
    }
}
