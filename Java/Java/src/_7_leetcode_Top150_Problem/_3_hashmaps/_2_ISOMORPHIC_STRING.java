package _7_leetcode_Top150_Problem._3_hashmaps;

import java.util.HashMap;

public class _2_ISOMORPHIC_STRING {
    public static void main(String[] args) {
        System.out.println(isIsomorphic("egg", "add"));
    }
    public static boolean isIsomorphic(String s, String t){
        if (s.length()!= t.length()){
            return false;
        }
        HashMap<Character, Character> map = new HashMap<>();
        for (int i = 0 ; i<s.length() ; i++){
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            if (!map.containsKey(c1)){
                if (!map.containsValue(c2)){
                    map.put(c1, c2);
                }
                else {
                    return false;
                }
            }
            else {
                if (map.get(c1) != c2){
                    return false;
                }
            }
        }
        return true;
    }
}
