package Striver_1_Arrays;
//{1,2,3,1,1,1,1,3,3}
//k= 6
//Best optimmised for non negative value

public class _9_LongestSubArrayWithSumK {
    public static void main(String[] args) {
      int arr[] = {1,2,3,1,1,1,1,3,3};
      int sum= arr[0];
      int right =0 ;
      int left=0;
      int k =6;
      int maxLen=0;
      while(right< arr.length){
          while(left<=right && sum>k){
              sum  = sum -arr[left];
              left++;
          }
          if (sum==k ){
              maxLen = Math.max(maxLen, right - left +1);
          }
          right++;
          if (right< arr.length){
              sum= sum +arr[right];
          }
      }
        System.out.println(maxLen);
    }
}
