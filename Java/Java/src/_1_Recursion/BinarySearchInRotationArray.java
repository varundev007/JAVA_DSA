package _1_Recursion;

public class BinarySearchInRotationArray {
    public static void main(String[] args) {
        int arr[] = {7, 8, 9, 1, 2, 3, 4, 5};
        int target;
        System.out.println(FindIndex(arr, 0, arr.length - 1,79));

    }

    public static int FindIndex(int arr[], int s, int e, int target) {
        if (s > e) {
            return -1;
        }
        int m = (s + e) / 2;
        if (arr[m] == target) {
            return m;
        }
        if (arr[s] <= arr[m]) {
            if (target >= arr[s] && target <= arr[m]) {
                return FindIndex(arr, s, m - 1, target);
            } else {
                return FindIndex(arr, m + 1, e, target);
            }
        }
        if (target >= arr[m] && target <= arr[e]) {
            return FindIndex(arr, m + 1, e, target);
        }
        else{
        return FindIndex(arr, s, m - 1, target);}
    }
}