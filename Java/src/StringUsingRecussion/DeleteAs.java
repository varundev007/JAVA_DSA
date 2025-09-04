package StringUsingRecussion;
import java.awt.datatransfer.StringSelection;
import java.util.*;
public class DeleteAs {
    public static void main(String[] args) {
        String str="varun";
//        delete("",str);
        System.out.println(skip(str));
    }
    public static void delete(String p, String up){
        if(up.length()==0){
            System.out.println(p);
            return;
        }
        char ch= up.charAt(0);
        if(ch=='a'){
            delete(p, up.substring(1));

        }else {
            delete(p+ch, up.substring(1));
        }

    }
    public static String skip(String str){
        if (str.length()==0){
            return "";
        }
        char ch = str.charAt(0);
        if(ch=='a'){
            return skip(str.substring(1));
        } else{
            return ch + skip(str.substring(1));
        }
    }

}
