package _7_leetcode_Top150_Problem._2_Two_Pointers;

import java.util.Arrays;

/*
Example 1:

Input: s = "abc", t = "ahbgdc"
Output: true
Example 2:

Input: s = "axc", t = "ahbgdc"
Output: false
 */
public class _2_isSubsequence {
    public static void main(String[] args) {
        String s = "abc";
        String t = "ahbgdc";
        System.out.println(isSubsequence(s,t));
    }
    public static boolean isSubsequence(String s, String t){
        int i = 0 ;
        int j = 0;
        while (i< s.length() && j<t.length()){
            if(s.charAt(i) == t.charAt(j)){
                i++;
                j++;
            }
            else {
                j++;
            }
        }
        return (i == s.length());
    }
}
