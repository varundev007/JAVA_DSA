package Striver_1_Arrays;

import java.util.Arrays;

public class _20_LongestConsicutiveSequence {
    public static void main(String[] args) {
        int arr[] = {101, 100, 102, 4,4,1,1,2,2,3,3,3};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int prevSmallest= Integer.MIN_VALUE;
        int cnt = 0;
        int longest =1;
        for (int i = 0 ; i< arr.length ; i++){
            if ((arr[i] - 1 ) == prevSmallest){
                cnt++;
                prevSmallest=arr[i];
            } else if (prevSmallest != arr[i]) {
                cnt=1;
                prevSmallest=arr[i];
            }
            longest = Math.max(longest, cnt);
        }
        System.out.println(longest);
    }
}
