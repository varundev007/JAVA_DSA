package _7_leetcode_Top150_Problem;
/*
Example 1:

Input: haystack = "sadbutsad", needle = "sad"
Output: 0
Explanation: "sad" occurs at index 0 and 6.
The first occurrence is at index 0, so we return 0.
Example 2:

Input: haystack = "leetcode", needle = "leeto"
Output: -1
Explanation: "leeto" did not occur in "leetcode", so we return -1.
 */
public class _17_indexOfFirstOccurence {
    public static void main(String[] args) {
        String haystack ="asadsabutsad";
        String needle = "sad";
        System.out.println(findIndex(haystack, needle,0));
    }
    public static int findIndex(String up, String p, int idx ){
        if (up.isEmpty()){
            return -1;
        }
        if(up.startsWith(p)){
            return idx;
        }
        return findIndex(up.substring(1),p,idx+1);

    }
}
