package Striver_1_Arrays;

import java.util.ArrayList;

public class _28_4sum {
    public static void main(String[] args) {
        int arr[] = {1, 1,1,2,2,2,3,3,3,4,4,4,5,5};//sorted
        int target = 8;
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        for (int i =0 ; i< arr.length ; i++){
            if (i>0 && arr[i] == arr[i-1]){
                continue;
            }
            for (int j = i+1 ; j < arr.length ; j++){
                if (arr[j] == arr[j-1] && j> i+1){
                    continue;
                }
                int k = j+1;
                int l= arr.length-1;
                while (l>k){
                    if ((arr[i] + arr[j] + arr[k] +arr[l]) > target){
                        l--;
                    } else if ((arr[i] + arr[j] + arr[k] +arr[l]) < target) {
                        k++;
                    }
                    else {
                        ArrayList<Integer> temp = new ArrayList<>();
                        temp.add(arr[i]);
                        temp.add(arr[j]);
                        temp.add(arr[k]);
                        temp.add(arr[l]);
                        ans.add(temp);
                        k++;
                        l--;
                        while (l>k && arr[k] == arr[k-1]){
                            k++;
                        }
                        while (l> k && arr[l] ==arr[l+1]){
                            l--;
                        }
                    }
                }
            }
        }
        System.out.println(ans);
    }
}
