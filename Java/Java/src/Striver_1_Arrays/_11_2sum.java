package Striver_1_Arrays;
//{2,5,8,6,11}
//k=14 return index 2,3 6+8=14

import java.util.HashMap;

public class _11_2sum {
    public static void main(String[] args) {
        int arr[] = {2,5,6,8,11};
        int k = 14;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i =0; i< arr.length ; i++){
          if (map.containsKey( k - arr[i])){
              System.out.println(i+ " "+map.get(k- arr[i]));
          }
          else {
              map.put(arr[i], i);
          }
        }
    }
}
