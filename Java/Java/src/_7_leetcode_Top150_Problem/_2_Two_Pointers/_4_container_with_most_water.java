package _7_leetcode_Top150_Problem._2_Two_Pointers;
/*
Example 1:


Input: height = [1,8,6,2,5,4,8,3,7]
Output: 49
Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.
Example 2:

Input: height = [1,1]
Output: 1
 */
public class _4_container_with_most_water {
    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
    }
    public static int maxArea(int[] height){
        int left = 0 ;
        int right = height.length-1;
        int maxArea = 0;
        while (right > left){
            int area = Math.min(height[left] , height[right]) *(right-left);
            maxArea = Math.max(maxArea,area);
            if(height[left] < height[right]){
                left++;
            }
            else {
                right--;
            }
        }
        return maxArea;
    }
}
