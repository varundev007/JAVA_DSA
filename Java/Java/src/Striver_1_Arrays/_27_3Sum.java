package Striver_1_Arrays;

import java.util.ArrayList;
import java.util.Arrays;

//-1 -1 -1 0 0 0 -2 -2 -2 2 2 2
//ans -1 0 1, -2 0 2
//approch - sorting it and using 3 pointers

//Time Complexity = O(n log n) + O(n^2) = O(n^2)
//Space Complexity = O(k)
public class _27_3Sum {
    public static void main(String[] args) {
        int arr[] = {-1, -1, -1, 0, 0, 0, -2, -2, -2, 2, 2, 2};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        for (int i=0; i< arr.length ; i++){
            if(i>0 && arr[i] == arr[i-1]){
                continue;
            }
            int j= i+1;
            int k= arr.length-1;
            while(j<k){
                int sum = arr[i] + arr[j] + arr[k];
                if (sum>0){
                    k--;
                }
                else if (sum<0){
                    i++;
                }
                else {
                    ArrayList<Integer> temp = new ArrayList<>();
                    temp.add(arr[i]);temp.add(arr[j]);temp.add(arr[k]);
                    ans.add(temp);
                    j++;
                    k--;
                    while(arr[j] == arr[j-1] && k>j){
                        j++;
                    }
                    while(arr[k] == arr[k+1] && k>j){
                        k--;
                    }
                }
            }
        }
        System.out.println(ans);
    }
}
