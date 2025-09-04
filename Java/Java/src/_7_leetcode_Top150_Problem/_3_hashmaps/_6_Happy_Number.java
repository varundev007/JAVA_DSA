package _7_leetcode_Top150_Problem._3_hashmaps;

import java.util.HashSet;
import java.util.Set;

public class _6_Happy_Number {
    public static void main(String[] args) {
        System.out.println(isHappy(2));
    }
    public static boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        while(true){
            int sum = 0;
            while(n!=0){
                sum = (int) (sum + Math.pow( n%10 , 2));
                n= n/10;
            }
            if(sum == 1) return true;

            n = sum;
            if (set.contains(n)) return false;

            set.add(n);
        }
    }
}
