package Striver_1_Arrays;

import java.util.HashMap;

// {4,6,3,2,1,1} n=6
// missing - 5, repeating - 1
public class _32_MissingAndRepeatingNumber {
    public static void main(String[] args) {
        int arr[] = {4,6,3,2,1,1};
        int n =6;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i =1 ; i<=n ; i++){
            map.put(i,0);
        }
       // System.out.println(map);

        for (int i =0 ; i< arr.length ; i++){
            if (map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i]) + 1);
            }
            else {
                continue;
            }
        }
        System.out.println(map);
        for (int key : map.keySet()){
            if (map.get(key) ==0){
                System.out.println("missing " +key);
            } else if (map.get(key) >1) {
                System.out.println("Repeating " +key);
            }
        }
    }
}
