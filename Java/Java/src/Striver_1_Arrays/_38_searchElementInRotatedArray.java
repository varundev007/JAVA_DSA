package Striver_1_Arrays;

//https://leetcode.com/problems/search-in-rotated-sorted-array

public class _38_searchElementInRotatedArray {
    public static void main(String[] args) {
        int arr[] = {3,5,1};
        int target=3;
        System.out.println(findPivot(arr));
        System.out.println(search(arr,target));
    }
    public static int search(int arr[], int target){
        int pivot = findPivot(arr);
        if (pivot != -1){
            if (arr[pivot] == target){
                return pivot;
            }
            if (target >= arr[0]){
                return binarySearch(arr,target,0,pivot-1);
            }
            return binarySearch(arr,target,pivot+1, arr.length-1);
        }
        else {
            return binarySearch(arr,target, 0, arr.length-1);
        }
    }
    public static int binarySearch(int arr[], int target, int start, int end){
        while(start <= end){
            int mid = start + (end - start)/2;
            if (arr[mid] == target){
                return mid;
            }
            if (target > arr[mid]){
                start = mid+1;
            }
            else {
                end = mid-1;
            }
        }
        return -1;
    }
    public static int findPivot(int arr[]){
        int start = 0;
        int end =arr.length - 1;
        while (start <= end){
            int mid = start + (end - start)/2;
            if (mid+1<arr.length && arr[mid] > arr[mid+1]){
                return  mid;
            }
            if (mid-1 >= 0 && arr[mid - 1] > arr[mid]){
                return mid-1;
            }
            if (arr[start] >= arr[mid]){
                end= mid-1;
            }
            else {
                start = mid+1;
            }
        }
        return -1;
    }
}
