package Striver_1_Arrays;
// {4,6,3,2,1,1} n=6
// missing - 5, repeating - 1
//approch mathematical -
// x-> repeating , y->missing
// x+y =   (sum of n integer + sum of arr eleeent)
// x2 = y2 = (sum of sq of n integer + sum of sq of arr element

public class _33_MissingRepeatingNumber_optimal {
    public static void main(String[] args) {
        int arr[] = {4,6,3,2,1,1};
        int n = arr.length;
        int sumOfN=0;
        int sumOfArr=0;
        int sqSumOfN=0;
        int sqSumOfArr=0;
        int x,y;
        for(int i=1 ; i<=n ; i++){
            sumOfN = sumOfN +i;
            sumOfArr = sumOfN + arr[i-1];
            sqSumOfN = sqSumOfN + i*i;
            sqSumOfArr= sqSumOfArr + arr[i] * arr[i];
           // x- y = sumOfArr - sumOfN;
           // x*x - y*y = sqSumOfArr - sqSumOfN;
        }


    }
}
