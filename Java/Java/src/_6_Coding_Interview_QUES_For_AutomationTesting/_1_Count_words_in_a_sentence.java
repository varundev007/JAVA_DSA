package _6_Coding_Interview_QUES_For_AutomationTesting;

import Hashing.Hashmaps;

import java.util.Arrays;
import java.util.HashMap;

// QUES: Count number of each words in a sentence
public class _1_Count_words_in_a_sentence {
    public static void main(String[] args) {
        String str= "I love java I love coding";
        countWords(str);
    }
    public static void countWords(String str){
        String arr[] = str.split(" ");
    //    System.out.println(Arrays.toString(arr));
        HashMap<String, Integer> map = new HashMap<>();

        for(int i=0 ; i< arr.length ; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i]) + 1);
            }
            else{
                map.put(arr[i], 1);
            }
        }

        for( String x : map.keySet()){
            System.out.println( "Count of word - " + x + " - " +map.get(x));
        }
    }
}
