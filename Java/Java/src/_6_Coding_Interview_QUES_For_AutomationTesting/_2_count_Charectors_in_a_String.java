package _6_Coding_Interview_QUES_For_AutomationTesting;

import java.util.HashMap;

public class _2_count_Charectors_in_a_String {
    public static void main(String[] args) {
        String str = "Java is a object oriented programming language";
        countCharMethod1(str);
    }
    public static void countCharMethod1(String str){

        String strWithNoSpace = str.replaceAll(" ","");
        System.out.println(strWithNoSpace);

        HashMap<Character, Integer> map = new HashMap<>();
        for(int i =0 ; i< strWithNoSpace.length(); i++){
            map.put(strWithNoSpace.charAt(i), 1);
        }
        for(Character x : map.keySet()){
            //length of a charector = total length - length without a charector
            int count = str.length() - str.replaceAll(String.valueOf(x),"").length();
            System.out.println("Length of " +x+" - " +count);
        }


    }
}
