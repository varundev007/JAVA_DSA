package Recursion;

import java.util.Arrays;

public class mergeSort {
    public static void main(String[] args) {
        int arr[]= {6,5,2,7,8};
        arr =MergeSort(arr);
        System.out.println(Arrays.toString(arr));

    }
    public static int[] MergeSort(int arr[]){
        if(arr.length==1){
            return arr;
        }
        int m= arr.length/2;
        int[] left=MergeSort(Arrays.copyOfRange(arr,0,m));
        int[] right=MergeSort(Arrays.copyOfRange(arr,m,arr.length));
        return Merge(left,right);
    }
    public static int[] Merge(int[] first, int[] second){
        int[] mix=new int[first.length+second.length];
        int i=0; //to treverse left arry
        int j=0;//to traverse in right array
        int k=0; //to tarverse in new array
        while (i< first.length  && j<second.length){
            if(first[i]<second[j]){
                mix[k]=first[i];
                i++;
            }else{
                mix[k]=second[j];
                j++;
            }
            k++;
        }

        //Adding in mix array for the array which is larger
        while(i< first.length){
            mix[k]=first[i];
            i++;
            k++;
        }
        while(j< second.length){
            mix[k]=second[j];
            j++;
            k++;
        }
        return  mix;

    }
}
