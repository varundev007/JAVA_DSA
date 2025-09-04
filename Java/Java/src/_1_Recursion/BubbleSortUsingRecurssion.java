
package _1_Recursion;
import java.util.*;
public class BubbleSortUsingRecurssion {
    public static void main(String[] args) {
        int arr[]={4,22,56,2,6,26,9,10,5};
        sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void sort(int arr[],int index,int last){
        if(last==0){
            return;
        }
        if(index<last){
            if(arr[index]>arr[index+1]){
                //swap
                int temp=arr[index];
                arr[index]=arr[index+1];
                arr[index+1]=temp;
                sort(arr, index + 1, last);
            }else{
                sort(arr, index + 1, last);}
        }
        sort(arr,0,last-1);
    }
}
