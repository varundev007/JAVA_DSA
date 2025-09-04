package Striver_2_SlidingWindow_TwoPointer;

import java.util.HashMap;

public class _2_LongestSubStringWithoutRepeatingChar {
    public static void main(String[] args) {
        String str = "cadbzabcd";
        System.out.println(findMaxLen(str));
    }
    public static int findMaxLen(String str){
        int i =0 ;
        int j = 0;
        int maxLen =0 ;
        HashMap<Character, Integer> map =new HashMap<>();

        while (j<str.length()){
            char ch = str.charAt(j);
            if (!map.containsKey(ch) || i > map.get(ch)){
                map.put(ch, j);
                maxLen = Math.max(maxLen , j-i+1);
            }
            else {
                i = map.get(ch) +1;
                map.put(ch, j);
            }
            j++;
        }
        return maxLen;
    }
}
