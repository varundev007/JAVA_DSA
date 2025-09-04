package _7_leetcode_Top150_Problem._3_hashmaps;

import java.util.*;

public class _8_GroupAnagram {
    public static void main(String[] args) {
        String strs [] = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(strs));

    }
    public static List<List<String>> groupAnagrams(String[] strs) {
        String arr[] = new String[strs.length];
        for (int i =0 ; i< strs.length ; i++){
             char tempArr[] = strs[i].toCharArray();
            Arrays.sort(tempArr);
            arr[i] = "";
            for (char ch : tempArr){
                arr[i] = arr[i] + ch;
            }
        }
       HashMap<String, List<String>> map = new HashMap<>();
        for (int i = 0 ; i< arr.length ; i++){
            if (!map.containsKey(arr[i])){
                map.put(arr[i], new ArrayList<>());
                map.get(arr[i]).add(strs[i]);
            }
            else {
                map.get(arr[i]).add(strs[i]);
            }
        }
        List<List<String>> result = new ArrayList<>();
        for (String s : map.keySet()){
            result.add(map.get(s));
        }
        return result;
    }
}
