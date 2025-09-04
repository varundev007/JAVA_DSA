package _6_Coding_Interview_QUES_For_AutomationTesting;

import java.util.Arrays;

public class _10_reverse_each_word_in_string {
    public static void main(String[] args) {
        String str = "how are u";
        // woh era u

        reverseWord(str);
    }
    public static void reverseWord(String str){
        String arr[] = str.split(" ");
        for(int i=0; i< arr.length ; i++){
            String word = "";
            for(int j= arr[i].length()-1; j>=0 ; j--){
                word = word + arr[i].charAt(j);
            }
            arr[i] = word;
        }
        String ans = "";
        System.out.println(Arrays.toString(arr));
        for(String s : arr){
            ans =  ans + " " +s;
        }
        System.out.println(ans);
    }
}
