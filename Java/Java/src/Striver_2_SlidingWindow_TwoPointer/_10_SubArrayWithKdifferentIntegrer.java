package Striver_2_SlidingWindow_TwoPointer;

import java.util.HashMap;

public class _10_SubArrayWithKdifferentIntegrer {
    public static void main(String[] args) {
        int arr[] = {1,2,1,3,4};
        int k =3;
        System.out.println(findSubArrWithLessThsKint(arr, k) - findSubArrWithLessThsKint(arr, k-1));
    }
    public static int findSubArrWithLessThsKint(int arr[], int k ){
        if(k<0) return  0;
        int l = 0 ; int cnt = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int r =0 ; r< arr.length ; r++){
            if (map.containsKey(arr[r])){
                map.put(arr[r], map.get(arr[r]) +1);
            }
            else {
                map.put(arr[r], 1);
            }
            while (map.size()>k){
                map.put(arr[l],map.get(arr[l]) - 1);
                if (map.get(arr[l]) == 0){
                    map.remove(arr[l]);
                }
                l++;
            }
            cnt = cnt + (r - l + 1);
        }
        return cnt;
    }
}
