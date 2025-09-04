package _7_leetcode_Top150_Problem._2_Two_Pointers;
/*
Example 1:

Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.
Example 2:

Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome.
Example 3:

Input: s = " "
Output: true
Explanation: s is an empty string "" after removing non-alphanumeric characters.
Since an empty string reads the same forward and backward, it is a palindrome.
 */

public class _1_ValidPalindrome {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
//        String r = s.replaceAll("[^a-zA-Z0-9]", "");
//        System.out.println(r);
//        String rev ="";
//        for (int i=0 ; i< r.length() ; i++){
//            rev = rev + r.charAt(r.length()-1-i );
//        }
//        System.out.println(rev);
//        System.out.println(r.equalsIgnoreCase(rev));
        System.out.println(validPalindrom(s));
    }
    public static  boolean validPalindrom(String s){
        String r = s.replaceAll("[^A-Za-z0-9]", "");
        String rev = "";
        for (int i=0 ; i<r.length() ; i++){
            rev =  rev + r.charAt(r.length()-1 - i);
        }
//        System.out.println(r);
//        System.out.println(rev);
        if(r.equalsIgnoreCase(rev)){
            return true;
        }
        else {
            return false;
        }
    }
}
