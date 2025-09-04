package _1_Recursion;

public class _1_binarySearch {
    public static void main(String[] args) {
        int arr[] = {12, 23, 34,56,67,89};
        System.out.println(binarySrach(arr, 67,0,arr.length-1));
    }
    public static int binarySrach(int arr[],int target, int s, int e){
        int m = s + (e - s)/2 ;
       if(s>e){
           return -1;
       }
       if (arr[m] == target){
           return m;
       }
       if (target < arr[m]){
           return binarySrach(arr, target, s, m-1);
       }
       else {
           return binarySrach(arr, target, m+1, e);
       }
    }
}
