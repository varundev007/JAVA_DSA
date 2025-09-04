package _6_Coding_Interview_QUES_For_AutomationTesting;

public class _8_String_isPalindrome {
    public static void main(String[] args) {
        String str = "naran";
        int first = 0;
        int last = str.length()-1;
        System.out.println(isPalindrome(first, last, str));

    }
    public static boolean isPalindrome(int first, int last, String str){
        if(first == str.length()/2  || last == str.length()/2 ){
            return true;
        }
        return  str.charAt(first) == str.charAt(last) && isPalindrome(first+1,last-1,str);

    }
}
