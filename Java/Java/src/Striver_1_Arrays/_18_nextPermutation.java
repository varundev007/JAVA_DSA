package Striver_1_Arrays;
// {2 ,3, 5, 4, 3, 0, 0}
//step1- find idx of first dip element starting from end
//now swap the first dip with next large element on right side
//reverse the right side of the array
public class _18_nextPermutation {
//    public static void main(String[] args) {
//        int arr[] = {2 ,3, 5, 4, 3, 0, 0};
//        int idx=-1;
//        for (int i = args.length-1 ; i>=0 ; i--){
//            if (arr[i-1] < arr[i]){
//                idx= i-1;
//                break;
//            }
//        }
//
//        if(idx == -1){
//            reverse(arr,0, arr.length-1);
//        }
//
//        for (int i= arr.length-1 ; i>=idx ; i--){
//            if (arr[i] > arr[idx]){
//                swap(arr[i], arr[idx]);
//                break;
//            }
//        }
//        reverse(arr, idx+1, arr.length-1)
//    }
//    public static void reverse(int arr[], int start, int end){
//        for (int i = start; i < (start + end) / 2 + 1; i++) {
//            int mirrorIndex = end - (i - start);  // Calculate corresponding element from the end
//            int temp = arr[i];
//            arr[i] = arr[mirrorIndex];
//            arr[mirrorIndex] = temp;
//        }
 //   }
}
