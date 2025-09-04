package _2_RecurssionInArray;

public class _4_BinarySearchInRotatedArray {
    public static void main(String[] args) {
        int arr[]= {5,6,7,8,9,1,2,3};
        int target =9;
        System.out.println(search(arr, 0, arr.length-1,target));
    }
    public static int search(int arr[], int s , int e, int target){
        int m= s + (e - s)/2 ;
        if(s>e){
            return -1;
        }
        if(arr[m] == target){
            return m;
        }
        if(arr[m] > arr[s]){
            if(target > arr[s] && target < arr[m]){
                return search(arr, s, m-1, target);
            }
            else{
                return search(arr, m+1, e, target);
            }
        }
        if(target>arr[m] && target <arr[e]){
            return search(arr, m+1, e, target);
        }
        return search(arr, s, m-1,target);
    }
}
