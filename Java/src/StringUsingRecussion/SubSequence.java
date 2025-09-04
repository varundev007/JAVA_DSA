package StringUsingRecussion;
import java.util.*;
public class SubSequence {
    public static void main(String[] args) {
        String str= "abc";
        seq("",str);
    }
    public static void seq(String p,String up){
        if(up.length()==0){
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        seq(p+ch,up.substring(1));
        seq(p,up.substring(1));
    }
}
