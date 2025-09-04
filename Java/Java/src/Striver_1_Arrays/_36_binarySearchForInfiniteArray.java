package Striver_1_Arrays;

public class _36_binarySearchForInfiniteArray {
    public static void main(String[] args) {
        int arr[] ={1,2,3,4,5,6,6,8,9,10,12,13,15,16};
        int target= 8;
        findRange(arr, target );
    }
    public static void findRange(int arr[], int target){
        int start= 0;
        int end =1;
        while(target > arr[end]){
            int newStart = end+1;
            end = end + (end - start + 1)*2;
            start =newStart;
        }
        System.out.println(binarySearch(arr, target, start,end));
    }
    public static int binarySearch(int arr[], int target, int start, int end){
        while (start <= end){
            int mid = start + (end -start)/2 ;
            if(target == arr[mid]){
                return mid;
            } else if (target > arr[mid]) {
                start = mid + 1;
            }
            else {
                end = mid-1;
            }
        }
        return -1;
    }
}
