package _7_leetcode_Top150_Problem._3_hashmaps;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.SplittableRandom;

public class _3_word_pattern {
    public static void main(String[] args) {
        String s = "dog cat cat dog";
        String pattern = "abba";
        System.out.println(wordPattern(pattern, s));
    }
    public static boolean wordPattern(String pattern, String s) {
        String p = pattern;
        String arr[] = s.split(" ");
        if (p.length() != arr.length){
            return false;
        }
        else {
            HashMap<Character, String > map = new HashMap<>();
            for (int i = 0 ; i<p.length() ; i++){
                char c1= p.charAt(i);
                String s1= arr[i];
                if (!map.containsKey(c1)){
                    if (!map.containsValue(s1)){
                        map.put(c1, s1);
                    }
                    else {
                        return false;
                    }
                }
                else {
                    if(!(map.get(c1)).equals(s1)){
                        return false;
                    }
                }
            }
            return true;
        }
    }
}
