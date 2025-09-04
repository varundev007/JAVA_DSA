package Striver_2_SlidingWindow_TwoPointer;
//same as _4_
import java.util.HashMap;

public class _5_LongestSubStringWithAtmostKdistintCharevtors {
    public static void main(String[] args) {
        String str = "aaabbccd";
        int k =2;
        System.out.println(findMax(str,k));
    }
    public static int findMax(String str, int k){
        HashMap<Character, Integer> map = new HashMap<>();
        int left= 0; int right = 0;
        int max =0 ;
        int n = str.length();
        for (right =0 ; right < n ; right++){
            char rightChar= str.charAt(right);
            if (map.containsKey(rightChar)){
                map.put(rightChar, map.get(rightChar) + 1);
            }
            else{
                map.put(rightChar,1);
            }
            while (map.size() > k){
                char leftChar = str.charAt(left);
                map.put(leftChar, map.get(leftChar) - 1);
                if (map.get(leftChar) == 0){
                    map.remove(leftChar);
                }
                left++;
            }
            max = Math.max(max, right - left + 1);
        }
        return max;
    }
}
