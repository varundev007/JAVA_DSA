package _6_Coding_Interview_QUES_For_AutomationTesting;

// How to find duplicate characters

import java.util.Arrays;
import java.util.HashMap;

public class _3_find_duplicate_charectors {
    public static void main(String[] args) {
        String str = "Laptopt";
        findDuplicate(str);
    }
    public static void findDuplicate(String str){
        char arr[] = str.toCharArray();
     //   System.out.println(Arrays.toString(arr));
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i =0 ; i < arr.length ; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i]) + 1);
            }
            else {
                map.put(arr[i], 1);
            }
        }
        System.out.println("Duplicate charectors are :- ");
        for( Character c : map.keySet()){
            if(map.get(c) > 1){
                System.out.println(c);
            }
        }
    }
}
