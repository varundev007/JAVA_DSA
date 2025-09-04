package _4_Strings_Recursion_Loop;

public class _2_deleteAs {
    public static void main(String[] args) {
        String str = "abcdapplebdan";
        String str1="";
     //   System.out.println(removeA(str,str1));
    //    System.out.println(delete(str,str1, 0));
        skipApple("", str);
    }
    //LOOP
    public static String removeA(String str, String str1){
        for (int i = 0 ; i < str.length() ; i++){
            if(str.charAt(i) != 'a'){
                str1= str1 + str.charAt(i);
            }
            else{
                continue;
            }
        }
        return str1;
    }

    public static String delete(String str ,  String str1, int idx){
        if(idx == str.length()){
            return str1;
        }
        if(str.charAt(idx) == 'a'){
            return delete(str,str1, idx+1);
        }
        return delete(str, str1 + str.charAt(idx), idx+1);
    }

    public static void skipApple(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch= up.charAt(0);
        if(up.startsWith("apple")){
            skipApple(p, up.substring(5));
        }
        else{
            skipApple(p+ch, up.substring(1));
        }
    }
}
