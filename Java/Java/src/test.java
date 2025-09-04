import java.lang.reflect.Array;
import java.util.ArrayList;

public class test {
    public static void main(String[] args) {
        String s ="1abc2x30yz67";
        String temp = "0";
        int sum= 0;

        for (int i = 0; i< s.length(); i++){
            char ch = s.charAt(i);
            if (Character.isDigit(ch)){
                temp = temp + ch;
            }
            else {
                sum = sum + Integer.parseInt(temp);
                temp="0";
            }
        }
        System.out.println(sum + Integer.parseInt(temp));
    }
}
