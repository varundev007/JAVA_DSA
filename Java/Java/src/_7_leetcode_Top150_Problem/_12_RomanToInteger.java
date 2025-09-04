package _7_leetcode_Top150_Problem;
/*
Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000

Example 1:

Input: s = "III"
Output: 3
Explanation: III = 3.
Example 2:

Input: s = "LVIII"
Output: 58
Explanation: L = 50, V= 5, III = 3.
Example 3:

Input: s = "MCMXCIV"
Output: 1994
Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
 */

import java.util.LinkedHashMap;

public class _12_RomanToInteger {
    public static void main(String[] args) {
        String s = "LVIII";
        convertRtoI(s);
    }
    public static void convertRtoI(String s){
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int result = 0;
        result = map.get(s.charAt(s.length()-1));
        for (int i = s.length()-2 ; i>=0 ;i--){
            if (map.get(s.charAt(i)) < map.get(s.charAt(i+1)) ){
                result= result - map.get(s.charAt(i));
            }
            else {
                result= result + map.get(s.charAt(i));
            }
        }
        System.out.println(result);
    }
}
