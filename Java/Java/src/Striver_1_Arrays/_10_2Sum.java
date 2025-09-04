package Striver_1_Arrays;
// {2,5,6,8,11}
//k =14 return true 6+8 14
public class _10_2Sum {
    public static void main(String[] args) {
        int arr[] = {2,5,6,8,11};
        int k=14;
        System.out.println(TwoSum(arr,k));

    }
    public static boolean TwoSum(int arr[] , int k){
        int sum = 0;
        int left=0;
        int right = arr.length-1;
        while (left <arr.length && left <=right){
            sum = arr[right] + arr[left];
            if (sum> k){
                right= right-1;
            } else if (sum < k) {
                left = left +1;
            }
            else {
                return true;
            }
        }
        return false;
    }
}
