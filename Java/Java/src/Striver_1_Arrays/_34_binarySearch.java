package Striver_1_Arrays;

public class _34_binarySearch {
    public static void main(String[] args) {
        int arr[] ={3,5,8,10,40,80};
        int target = 40;
        System.out.println(search(arr, target));
    }
    public static int search(int arr[], int target){
        int s=0;
        int e = arr.length -1;

        while (s<=e){
            int m = s + (e - s)/2 ;
            if (arr[m] == target){
                return m;
            }
            if (target > arr[m]){
                s = m+1;
            }
            else {
                e = m-1;
            }
        }
        return -1;
    }
}
