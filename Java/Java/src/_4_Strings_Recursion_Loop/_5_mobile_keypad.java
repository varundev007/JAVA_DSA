package _4_Strings_Recursion_Loop;

import java.util.HashMap;

public class _5_mobile_keypad {
    public static void main(String[] args) {
//        String p="";
//        String up = "12";
//        keypad(p,up);
        // Step 1: Create HashMap<String, String>
        HashMap<Integer, String> map = new HashMap<>();
        map.put(2, "abc");
        map.put(3, "def");
        map.put(4, "ghi");
        map.put(5, "jkl");
        map.put(6, "mno");
        map.put(7, "pqrs");
        map.put(8, "tuv");
        map.put(9, "wxyz");
        keypad2("","89",map);
    }
    //
    public static void keypad(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        int digit = up.charAt(0) - '0';
        for (int i = (digit - 1) * 3 ; i<digit * 3 ; i++){
            char ch = (char) (i +'a');
            keypad(p+ch , up.substring(1));
        }
    }

    public static void keypad2(String p , String up, HashMap<Integer, String> map){
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }
        int digit =up.charAt(0) - '0';
        String letter = map.get(digit);
        for (int i = 0 ; i<letter.length(); i++){
            char ch = letter.charAt(i);
            keypad2(p+ch,up.substring(1),map);
        }
    }
}
