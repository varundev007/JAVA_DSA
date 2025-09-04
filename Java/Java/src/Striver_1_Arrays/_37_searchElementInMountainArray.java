package Striver_1_Arrays;

//https://leetcode.com/problems/find-in-mountain-array/description/

//logic
//Find peak .. and Binarysearch in both sorted array

public class _37_searchElementInMountainArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,3,1};
        int target = 3;
        int peakIndex = findPeak(arr);
        int leftSearch = binarySearch(arr, target, 0,peakIndex);
        int rightSearch = binarySearch(arr, target, peakIndex+1, arr.length-1);
        if (leftSearch == -1){
            System.out.println(rightSearch);
        }
        else {
            System.out.println(leftSearch);
        }
    }
    public static int binarySearch(int arr[], int target, int start, int end){
        while(start <= end){
            int mid =start + (end - start)/2;
            if (arr[mid] == target){
                return mid;
            }
            else if (arr[mid] > target){
                end = mid - 1;
            }
            else {
                start = mid+1;
            }
        }
        return -1;
    }
    public static int findPeak(int arr[]){
        int start = 0 ;
        int end = arr.length-1;
        while(start != end){
            int mid =start + (end - start)/2;
            if(arr[mid] > arr[mid + 1]){
                end = mid;
            }
            else {
                start = mid + 1;
            }
        }
        return start;
    }
}
