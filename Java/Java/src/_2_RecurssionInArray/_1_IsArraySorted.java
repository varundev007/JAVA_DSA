package _2_RecurssionInArray;

public class _1_IsArraySorted {
    public static void main(String[] args) {
        int arr[] = {12,34,45,65,96};
        System.out.println(isSorted(arr, 0));
    }
    public static boolean isSorted(int arr[], int index){
        if(index== arr.length-1){
            return true;
        }
        return arr[index] < arr[index+1] && isSorted(arr, index+1);
    }
}
