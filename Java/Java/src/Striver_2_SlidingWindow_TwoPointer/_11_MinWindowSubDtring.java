package Striver_2_SlidingWindow_TwoPointer;
//String s = "ddaaabbca"
//String t = "abc"
// answer =bca

import java.util.HashMap;

public class _11_MinWindowSubDtring {
    public static void main(String[] args) {
        String s = "ddaaabbca";
        String t = "abc";
        System.out.println(findSubStr(s,t));
    }

    public static String findSubStr(String s, String t){
        int l = 0;
        int minLen = Integer.MAX_VALUE;
        int cnt = 0;
        int sIndex = -1;
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (int r = 0; r < s.length(); r++) {
            char ch = s.charAt(r);
            if (map.get(ch) != null && map.get(ch) > 0) {
                cnt++;
            }
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) - 1);
            }

            while (cnt == t.length()) {
                if ((r - l + 1) < minLen) {
                    minLen = r - l + 1;
                    sIndex = l;
                }
                char chl = s.charAt(l);
                if (map.containsKey(chl)) {
                    map.put(chl, map.get(chl) + 1);
                    if (map.get(chl) > 0) {
                        cnt--;
                    }
                }
                l++;
            }
        }

        return (sIndex == -1) ? " " : s.substring(sIndex, sIndex + minLen);
    }
}
