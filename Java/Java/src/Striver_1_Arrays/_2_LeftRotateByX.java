package Striver_1_Arrays;

import java.util.ArrayList;
import java.util.Arrays;

//{1,2,3,4,5,6,7}
//rotate by D=2,
//{3,4,5,6,7,1,2}
public class _2_LeftRotateByX {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        int d=2;
        int n= arr.length;
        ArrayList<Integer> temp = new ArrayList<>();
        for (int i=0; i<=d-1;i++){
            temp.add(arr[i]);
        }
        for (int i =0 ; i<n-d ; i++){
            arr[i]=arr[i+d];
        }
        for (int i =0; i<temp.size(); i++){
            arr[n-d+i] = temp.get(i);
        }
        System.out.println(Arrays.toString(arr));
    }
}
