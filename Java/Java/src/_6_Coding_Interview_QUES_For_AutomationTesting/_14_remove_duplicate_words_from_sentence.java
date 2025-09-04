package _6_Coding_Interview_QUES_For_AutomationTesting;

import java.util.Arrays;
import java.util.LinkedHashMap;

public class _14_remove_duplicate_words_from_sentence {
    public static void main(String[] args) {
        String str = "my my name is varun varun";
        // my name is varun
        removeDuplicate(str);
    }

    public static void removeDuplicate(String str){
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        String arr[] = str.split(" ");
    //    System.out.println(Arrays.toString(arr));
        for (int i = 0; i< arr.length ; i++){
            map.put(arr[i], 1);
        }
        String ans = "";
        for(String s : map.keySet()){
            ans = ans + " " + s;
        }
        System.out.println(ans);
     }
}
