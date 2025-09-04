package Striver_1_Arrays;

import java.util.ArrayList;

public class _31mergeOverlappingInterval_optimized {
    public static void main(String[] args) {
        int arr[][] = {
                {1,3},{2,4},{2,6},{8,9},{8,10},{9,11}, {16,17},{15,18}
        };
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        int start = arr[0][0];
        int end =  arr[0][1];
        for (int i = 1; i<arr.length ; i++){
            if (arr[i][0]<=end ){
                start=Math.min(start,arr[i][0]);
                end= Math.max(end, arr[i][1]);
            }
            else {
                ArrayList<Integer> temp = new ArrayList<>();
                temp.add(start);
                temp.add(end);
                ans.add(temp);
                start=arr[i][0];
                end= arr[i][1];
            }

        }
        ArrayList<Integer> temp = new ArrayList<>();
        temp.add(start);
        temp.add(end);
        ans.add(temp);

        System.out.println(ans);
    }
}
