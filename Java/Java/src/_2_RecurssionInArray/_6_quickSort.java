package _2_RecurssionInArray;
// Idea to keep all smaller number in left of pivot and keep all greater number in right side
import java.lang.reflect.Array;
import java.util.Arrays;

public class _6_quickSort {
    public static void main(String[] args) {
        int arr[]= {6,7,3,5,2,9};
        quickS(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));

    }
    public static void quickS(int arr[], int lo, int hi){
        if (lo>= hi){//base condition
            return;
        }
        int s = lo;
        int e = hi;
        int m = s + (e - s)/2 ;
        int pivot = arr[m];
        while(s <= e){
            while(arr[s] < pivot){ //this is desired
                s++;
            }
            while(arr[e] > pivot){ // this is desired
                e--;
            }
            //when both loops breaks arr[e] , arr[s] not in correct position
            //SWAPPING
            if (s <= e){
                int temp = arr[s];
                arr[s]= arr[e];
                arr[e]= temp;
                s++;
                e--;
            }
        }
        quickS(arr, lo,e);
        quickS(arr, s, hi);
    }
}
