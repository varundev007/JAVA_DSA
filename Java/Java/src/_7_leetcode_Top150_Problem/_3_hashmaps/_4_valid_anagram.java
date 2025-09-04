package _7_leetcode_Top150_Problem._3_hashmaps;

import java.lang.reflect.Array;
import java.util.Arrays;

/*
An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
typically using all the original letters exactly once.



Example 1:

Input: s = "anagram", t = "nagaram"
Output: true
Example 2:

Input: s = "rat", t = "car"
Output: false

 */
public class _4_valid_anagram {
    public static void main(String[] args) {
        String s= "anagram";
        String t= "nagaram";
        System.out.println(isAnagram(s,t));
    }
    public static boolean isAnagram(String s, String t) {
        char s1[] = s.toCharArray();
        char t1[] = t.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(t1);
        if (Arrays.equals(s1,t1)){
            return  true;
        }
        else {
            return false;
        }
    }
}
