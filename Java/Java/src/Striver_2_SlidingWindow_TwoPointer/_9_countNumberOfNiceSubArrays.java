package Striver_2_SlidingWindow_TwoPointer;
// {1 1 2 1 1} k=3 => find no of sub arrays which k number of odd values in a sub array
// it is same as previous
//{1 1 2 1 1} => {1 1 0 1 1}
//not creating any new array
// just manging sumsing and substraction odd values from the sum
public class _9_countNumberOfNiceSubArrays {
    public static void main(String[] args) {
        int arr[] = {1, 5, 2, 1, 3};
        int k =3;
        System.out.println(findWithOddsLessThanEqualTo(arr, k)  -  findWithOddsLessThanEqualTo(arr, k-1));
    }
    public static int findWithOddsLessThanEqualTo(int arr[] , int k){
        int l = 0 ; int count = 0;
        int sum = 0;
        for (int r=0 ; r<arr.length ; r++){
            sum = sum + arr[r]%2;
            while (sum > k){
                sum = sum - arr[l] % 2 ;
                l++;
            }
            count = count + (r-l+1);
        }
        return count;
    }

}
