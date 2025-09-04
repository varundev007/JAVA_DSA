
//Logic- len - Maxfreq<=k that is desired condition
package Striver_2_SlidingWindow_TwoPointer;
import java.util.HashMap;

public class _7_LongestRepeatingCharectorReplacement {
    public static void main(String[] args) {
        String str = "aaabbcca";
        int k =2;
        System.out.println(maxLenOfSubArr(str,k));
    }
    public static int maxLenOfSubArr(String str, int k){
        HashMap<Character, Integer> map = new HashMap<>();
        int maxLen = 0 ; int maxFreq = 0; int l =0;
        for (int r =0 ; r<str.length() ; r++){
            char ch = str.charAt(r);
            if (map.containsKey(ch) ){
                map.put(ch, map.get(ch)+1);
            }
            else {
                map.put(ch,1);
            }
            maxFreq = Math.max(maxFreq, map.get(str.charAt(r)));
            if ((r-l+1) -maxFreq >k){
                char leftChar= str.charAt(l);
                map.put(leftChar, map.get(leftChar) - 1);
                l++;
            }
            maxLen = Math.max(maxLen, r-l+1);
        }
        return maxLen;
    }
}
