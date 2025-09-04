package Striver_1_Arrays;

import java.util.ArrayList;

// arr[] = {10, 22 , 14, 3,0,6}
// Leader- element which is largest of its right side
// ans[] = 22,14,6
public class _19_LeadersInAarray {
    public static void main(String[] args) {
        int arr[] = {10, 22 , 14, 3,0,6};
        ArrayList<Integer> ans = new ArrayList<>();
        int leader= arr[arr.length-1];
        ans.add(leader);
        for (int i = arr.length-2 ; i>=0 ; i-- ){
            if (arr[i] > leader){
                leader = arr[i];
                ans.add(leader);
            }
        }
        System.out.println(ans);
    }
}
