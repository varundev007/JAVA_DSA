package Striver_1_Arrays;

import java.util.HashMap;

public class _26_majorityElement2_optimal {
    public static void main(String[] args) {
        int arr[]= {1,1,1,3,3,2,2,2};
        HashMap< Integer, Integer> map = new HashMap<>();
        for ( int i = 0 ; i < arr.length ; i++){
            if (map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i]) + 1 );
            }
            else {
                map.put(arr[i],1);
            }
            if(map.get(arr[i]) == arr.length/3 +1){
                System.out.println(arr[i]);
            }
        }
    }
}
