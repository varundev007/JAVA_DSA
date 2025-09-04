package Striver_1_Arrays;
// No of rotation = pivot +1
public class _39_NoOfRotationInaRotatedArray {
    public static void main(String[] args) {
        int arr[] = {5,6,7,8,0,1,2};
        System.out.println(findPivot(arr) + 1);
    }
    public static int findPivot(int arr[]){
        int start = 0;
        int end = arr.length -1 ;
        while (start<= end){
            int mid = start + (end - start)/2;
            if ( mid+1<arr.length && arr[mid] > arr[mid+1]){
                return mid;
            }
            if (mid-1>=0 && arr[mid - 1] > arr[mid]){
                return mid+1;
            }
            if (arr[start] > arr[mid]){
                end =mid-1;
            }
            else {
                start=mid+1;
            }
        }
        return -1;
    }
}
