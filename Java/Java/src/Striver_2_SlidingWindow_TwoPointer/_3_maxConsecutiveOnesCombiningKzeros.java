package Striver_2_SlidingWindow_TwoPointer;
// { 1, 1, 1, 0, 0 , 0, 1, 1, 1, 1, 0, 0, 1, 1 }
//ans - 8
//logic -
// 1- take two pointer at zero index;
// 2- keep increasing right pointer untill zeros are more than k
// 3- move left pointer once it encounter zero reduces zeros and move right pointer and count max size (r -l -1)
public class _3_maxConsecutiveOnesCombiningKzeros {
    public static void main(String[] args) {
        int arr[] = {1, 1, 1, 0, 0 , 0, 1, 1, 1, 1, 0, 0, 1, 1};
        int k =2;
        int l = 0 ;
        int r =0;
        int maxVal = 0;
        int zeros= 0;
        int n = arr.length;
        for (r=0; r<n ; r++){
            if (arr[r] == 0){
                zeros++;
            }
            while (zeros > k){
                if (arr[l] == 0){
                    zeros--;
                }
                l++;
            }
            if (zeros <= k){
                maxVal = Math.max(maxVal , r-l+1);
            }
        }

        System.out.println(maxVal);
    }
}
