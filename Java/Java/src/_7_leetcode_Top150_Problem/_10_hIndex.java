package _7_leetcode_Top150_Problem;

import java.util.Arrays;

public class _10_hIndex {
    public static void main(String[] args) {
   //     int arr[] = {3, 0 ,6, 1, 5};
        int arr[] = {1,3,1};
        int count[] = new int[arr.length+1];
        count[0] =0;
        findAns(arr, count);
    }
    public static void findAns(int arr[] , int count[]){
        for(int i = 1 ; i< count.length ; i++){
            int cnt = 0;
            for (int j=0 ; j <arr.length ; j++){
                if(arr[j] >= i){
                    cnt = cnt + 1;
                    count[i] = cnt;
                }
                else {
                    continue;
                }
            }
        }
        System.out.println(Arrays.toString(count));
        int ans = 0;
        for (int i = 1 ; i< count.length ; i++){
            if(i<= count[i]){
                ans = i;
            }
            else {
                continue;
            }
        }
        System.out.println(ans);
    }
}
