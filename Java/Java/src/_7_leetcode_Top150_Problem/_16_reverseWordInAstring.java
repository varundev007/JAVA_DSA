package _7_leetcode_Top150_Problem;

import java.util.Arrays;

/*
Example 1:

Input: s = "the sky is blue"
Output: "blue is sky the"
Example 2:

Input: s = "  hello world  "
Output: "world hello"
Explanation: Your reversed string should not contain leading or trailing spaces.
Example 3:

Input: s = "a good   example"
Output: "example good a"
Explanation: You need to reduce multiple spaces between two words to a single space in the reversed string.
 */
public class _16_reverseWordInAstring {
    public static void main(String[] args) {
        String s= "   hello   word    ";
        System.out.println(reverseString(s));
    }
    public static String reverseString(String s){
        s= s.replaceAll("\s+", " ").trim();
        String arr[] = s.split(" ");
        String ans = "";
        for (int i = arr.length-1; i>=0 ;i--){
            ans = ans + " " +arr[i];
        }
        return ans;
    }
}
