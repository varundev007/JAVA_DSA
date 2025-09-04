package _7_leetcode_Top150_Problem._2_Two_Pointers;

import java.util.ArrayList;
import java.util.Arrays;

/*
Example 1:

Input: numbers = [2,7,11,15], target = 9
Output: [1,2]
Explanation: The sum of 2 and 7 is 9. Therefore, index1 = 1, index2 = 2. We return [1, 2].
Example 2:

Input: numbers = [2,3,4], target = 6
Output: [1,3]
Explanation: The sum of 2 and 4 is 6. Therefore index1 = 1, index2 = 3. We return [1, 3].
Example 3:

Input: numbers = [-1,0], target = -1
Output: [1,2]
Explanation: The sum of -1 and 0 is -1. Therefore index1 = 1, index2 = 2. We return [1, 2].
 */
public class _3_TwoSumII {
    public static void main(String[] args) {
        int numbers[] = {2,3,4};
        int target = 6;
     //   ArrayList<Integer> p = new ArrayList<>();
    //    int[] ans = findSum2(number, target, p);
   //     System.out.println(Arrays.toString(ans));
        int ans[] = findSum2(numbers,target);
        System.out.println(Arrays.toString(ans));

    }
    public static int[] findSum2(int number[] ,  int target, ArrayList p){

        for (int i =0 ; i<number.length ; i++){
            int j= i+1;
            while (j < number.length){
                if (number[i] + number[j] == target){
                    p.add(i+1);
                    p.add(j+1);
                    j++;
                }
                else {
                    j++;
                }
            }
        }
        int[] arr = new int[p.size()];
        for(int i = 0 ; i < p.size() ; i++){
            arr[i]= (int) p.get(i);
        }
        return arr;

        }

        public static int[] findSum2(int[] numbers , int target){
        int i = 0 ;
        int j = numbers.length - 1;
        while (j>i ){
            if (numbers[i] + numbers[j] == target){
                return new int[]{i + 1, j + 1};
            }
            if (numbers[i] + numbers[j] > target){
                j--;
            }
            else {
                i++;
            }
        }
        return new int[] {};
        }
    }



