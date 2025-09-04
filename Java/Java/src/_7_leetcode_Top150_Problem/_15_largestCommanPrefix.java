package _7_leetcode_Top150_Problem;

import _1_Recursion.PatternUsingRecursion1;

import java.util.Arrays;

/*
Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.
 */

//SOLUTION - SORT THE ARRAY COMPARE 1ST AND LAST STRING

public class _15_largestCommanPrefix {
    public static void main(String[] args) {
        String str[] ={"flower","flow","flight"};
        System.out.println(maxPredix(str));
    }
    public static String maxPredix(String str[]){
        Arrays.sort(str);
        String ans="";
        String s1 = str[0];
        String s2 = str[str.length-1];
        for (int i =0 ; i<s1.length() && i<s2.length() ; i++){
            if(s1.charAt(i) == s2.charAt(i)){
                ans = ans + s1.charAt(i);
            }
            else {
                break;
            }
        }
        return ans;
    }
}
