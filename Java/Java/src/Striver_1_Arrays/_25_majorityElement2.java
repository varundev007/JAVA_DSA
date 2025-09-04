package Striver_1_Arrays;

import java.util.HashMap;

//majority element2 frequency of element > arr.length/2
public class _25_majorityElement2 {
    public static void main(String[] args) {
        int arr[]= {1,1,1,3,3,2,2,2};
        HashMap<Integer, Integer> map = new HashMap<>();
        for ( int i = 0 ; i < arr.length ; i++){
            if (map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i]) + 1 );
            }
            else {
                map.put(arr[i],1);
            }
        }
        for (int key : map.keySet()){
            if(map.get(key) > arr.length/3){
                System.out.println(key);
            }
        }
    }
}
