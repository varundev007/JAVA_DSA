package Striver_1_Arrays;
//https://leetcode.com/problems/peak-index-in-a-mountain-array/
//https://leetcode.com/problems/find-peak-element/description/
public class _37_findPeakElementIntInMountainArray {
    public static void main(String[] args) {
        int arr[] = {1,2,10 ,9,8,7,3,2,1};
        System.out.println(findPeak(arr));
    }
    public static int findPeak(int arr[]){
        int start = 0;
        int end = arr.length-1;
        while (start != end){
            int mid = start + (end - start)/2;
            if (arr[mid] > arr[mid +1]){ //decreasomg array
                end = mid;
            }
            else {// increasing
                start = mid+1;
            }// at the end start and end both will equal and pointing to the peak element
        }
        return arr[start];
    }
}
