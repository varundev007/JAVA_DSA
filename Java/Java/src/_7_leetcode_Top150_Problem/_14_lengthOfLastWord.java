package _7_leetcode_Top150_Problem;

public class _14_lengthOfLastWord {
    public static void main(String[] args) {
        String str = "My name is varun";
        System.out.println(findLength(str));
    }
    public static int findLength(String str){
        String arr[]=str.split(" ");
        return arr[arr.length-1].length();

    }
}
