package _4_Strings_Recursion_Loop;
//
public class _3_subString {
    public static void main(String[] args) {
        String s = "abc";
        substr("",s);

    }
    public static void substr(String p , String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        // Two options
        substr(p + ch, up.substring(1));//take it
        substr(p, up.substring(1));//leave it

    }
}
