package _2_RecurssionInArray;

public class _2_LinearSearch {
    public static void main(String[] args) {
        int arr[] =  {34,32,21,56,78};
        int target = 78;
        //Searching target in a given array
        System.out.println(linearSRC(arr,0,target));
        System.out.println(srcValue(arr,0,target));
    }
    public static boolean linearSRC(int arr[], int idx, int target){
        if(idx ==  arr.length){
            return false;
        }
        return arr[idx] == target || linearSRC(arr,idx+1, target);
    }

    public static int srcValue(int arr[], int idx, int target){
        if(idx== arr.length){
            return -1;
        }
        if(arr[idx] == target){
            return idx;
        }
        else{
            return srcValue(arr, idx+1, target);
        }

    }

}
