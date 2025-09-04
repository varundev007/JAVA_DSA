package _6_Coding_Interview_QUES_For_AutomationTesting;

import java.util.LinkedHashMap;

public class _5_first_Non_Repeating_Char {

    //Find First Non Repeated character

    public static void main(String[] args) {
        String str = "program";
        findChar(str);
    }

    public static void findChar(String str){
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();// this will maintain the order.
        for(int i =0 ; i < str.length() ; i++){
            if(map.containsKey(str.charAt(i))){
                map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
            }
            else {
                map.put(str.charAt(i), 1);
            }
        }

        for(Character c : map.keySet()){
            if(map.get(c) == 1){
                System.out.println("Forst charector is - " +c);
                break;
            }
            else {
                continue;
            }
        }
    }
}
