package Recursion;

import java.util.Arrays;

public class SelectionSortUsingRecurssion {
    public static void main(String[] args) {
        int arr[]={4,22,56,2,6,26,9};
        sort(arr,0,arr.length,0);
        System.out.println(Arrays.toString(arr));

    }
    public static void sort(int arr[],int index,int last, int max)
    {
        if(last==0){
            return;
        }
        if(index<last){
            if(arr[index]>arr[max]){
                sort(arr,index+1,last,index);
            }else{
                sort(arr, index + 1, last,max);}
        }
        else{
            //swap
            int temp= arr[max];
            arr[max]=arr[last-1];
            arr[last-1]=temp;
            sort(arr,0,last-1,0);}
    }
}
