package _6_Coding_Interview_QUES_For_AutomationTesting;

import java.util.Arrays;
import java.util.SplittableRandom;

public class _9_reversing_sentence {
    public static void main(String[] args) {
        String str = "java is a programming language";
        // language programming a is java
        reverseSentance(str);
    }
    public static void reverseSentance(String str){
        String arr[] = str.split(" ");
      //  System.out.println(Arrays.toString(arr));
        String ans = "";
        for (int i = arr.length-1; i>=0 ; i--){
            ans= ans + " " + arr[i];
        }
        System.out.println(ans);
    }
}
