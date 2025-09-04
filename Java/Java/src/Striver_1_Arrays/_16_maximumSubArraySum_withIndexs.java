package Striver_1_Arrays;

public class _16_maximumSubArraySum_withIndexs {
    public static void main(String[] args) {
        int arr[] =  {-2,-3,4,-1,-2,1,5};
        int sum = 0 ;
        int maxSum = Integer.MIN_VALUE;
        int start=0;
        int end= 0;
        int temp = 0;
        for (int i =0 ; i< arr.length ; i++){
            sum= sum + arr[i];
            if(sum>maxSum){
                maxSum = sum;
                start=temp;
                end= i;

            }
            if (sum<0){
                sum=0;
                temp=i+1;
            }
        }
        for (int i=start ; i<=end ; i++){
            System.out.println(arr[i]);
        }
    }
}
