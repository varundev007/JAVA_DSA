package Striver_1_Arrays;

import java.util.ArrayList;

//sorted it first
//{1,3},{2,4},{2,6},{8,9},{8,10},{9,11}, {16,17},{15,18}
// ans - {1,6} , {8,11},  {15,18}
public class _30mergeOverlappingInterval {
    public static void main(String[] args) {
        int arr[][] = {
                {1,3},{2,4},{2,6},{8,9},{8,10},{9,11}, {16,17},{15,18}
        };
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        for (int i =0 ; i<arr.length ; i++){
            int start = arr[i][0];
            int end = arr[i][1];
            if (!ans.isEmpty() && end<= ans.get(ans.size()-1).get(1)){
                continue;
            }

            for (int j = i+1; j<arr.length ; j++){
                if(arr[j][0] <= end){
                    end= Math.max(end, arr[j][1]);
                }
                else{
                    break;
                }
            }
            ArrayList<Integer> temp = new ArrayList<>();
            temp.add(start);
            temp.add((end));
            ans.add(temp);
        }
        System.out.println(ans);
    }
}
