package _6_Coding_Interview_QUES_For_AutomationTesting;

import java.util.Arrays;

public class _4_If_2_str_anagrams {
    public static void main(String[] args) {
        String s1 ="step";
        String s2 ="pets";
        System.out.println(isAnagram(s1, s2));
    }
    public static boolean isAnagram(String s1, String s2){
        char arr1[] = s1.toLowerCase().toCharArray();
        char arr2[] = s2.toLowerCase().toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if(Arrays.equals(arr1,arr2))// REMEMBER
        {
            return true;
        }
        else {
            return false;
        }
    }
}
