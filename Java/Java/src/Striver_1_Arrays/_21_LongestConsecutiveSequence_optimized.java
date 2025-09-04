package Striver_1_Arrays;

import java.util.HashSet;
import java.util.Set;

public class _21_LongestConsecutiveSequence_optimized {
    public static void main(String[] args) {
        int arr[] = {101, 100, 102, 4,4,1,1,2,2,3,3,3};
        int longest = 1;
        int n = arr.length;
        if (n ==0 || n==1){
            longest = n;
        }
        Set<Integer> st = new HashSet<>();
        for (int num: arr){
            st.add(num);
        }
        for (int num : st){
            if ( !st.contains(num-1)){// means num is smallest for a seqence
                int cnt =1;
                int x= num;
                while (st.contains(x+1)){
                    cnt++;
                    x=x+1;
                }
                longest = Math.max(longest,cnt);
            }
        }
        System.out.println(longest);

    }
}
