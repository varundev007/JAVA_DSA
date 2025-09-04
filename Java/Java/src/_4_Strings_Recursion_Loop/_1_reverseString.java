package _4_Strings_Recursion_Loop;

import java.util.Arrays;

public class _1_reverseString {
    public static void main(String[] args) {
          String str = "abvjsa";
     //   StringBuffer sb = new StringBuffer("hello");
        StringBuilder sb = new StringBuilder(str);
        for(int i=0; i<sb.length()/2 ;i++){
            int front = i;
            int back = sb.length()-1-i;
            char frontCh = sb.charAt(front);
            char backCh = sb.charAt(back);
            sb.setCharAt(front,  backCh);
            sb.setCharAt(back , frontCh);
        }
        System.out.println(sb);
    }


}
