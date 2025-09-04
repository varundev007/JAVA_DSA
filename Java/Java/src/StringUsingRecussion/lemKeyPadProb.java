package StringUsingRecursion;
import java.util.*;

public class lemKeyPadProb {
    public static void main(String[] args) {
      //  pad("12", 0,"");
        pads("","12");
    }
    public static String[] KeyPad={".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};

    public static void pads(String p, String up) {
        if(up.length() == 0) {
            System.out.println(p);
            return;
        }
        char currChar= up.charAt(0);
        String keyword=KeyPad[currChar-'0'];
        for(int i = 0; i < keyword.length(); i++) {
            char ch = keyword.charAt(i);
            pads(p + ch, up.substring(1)); // Correction made here
        }
    }
//    public static void pad(String str, int idx, String comb){
//        if(idx==str.length()){
//            System.out.println(comb);
//            return;
//        }
//        char currChar= str.charAt(0);
//        String keyword=KeyPad[currChar-'0'];
//        for(int i=0; i<keyword.length();i++){
//            pad(str,idx+1,comb+keyword.charAt(i));
//        }
//    }
}