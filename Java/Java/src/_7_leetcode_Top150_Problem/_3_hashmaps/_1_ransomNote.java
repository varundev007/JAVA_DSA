package _7_leetcode_Top150_Problem._3_hashmaps;

import Hashing.Hashmaps;

import java.util.HashMap;

public class _1_ransomNote {
    public static void main(String[] args) {
        System.out.println(canConstruct("aa","aaaaa"));
    }
    public static boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character ,Integer> mapRn = toHashmap(ransomNote);
        HashMap<Character, Integer> mapMg = toHashmap(magazine);
        for (Character ch : mapRn.keySet()){
            if (mapRn.get(ch) > mapMg.get(ch)){
                return false;
            }
            else {
                continue;
            }
        }
        return true;
    }
    public static HashMap<Character ,Integer> toHashmap(String s){
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0 ; i<s.length() ; i++){
            if (map.containsKey(s.charAt(i))){
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            }
            else {
                map.put(s.charAt(i) , 1);
            }
        }
        return map;
    }
}
