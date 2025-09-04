package _7_leetcode_Top150_Problem;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class _4_Majority_elememt {

    /*
Example 1:
Input: nums = [3,2,3]
Output: 3

Example 2:
Input: nums = [2,2,1,1,1,2,2]
Output: 2

     */
    public static void main(String[] args) {
       // int arr[] = {2,2,1,1,1,2,2};
        int arr[] = {3 ,2, 3};
        majorityElement(arr);

      //  int maxValue = Collections.max(map.values());


  //      System.out.println("The greatest key value is: " + maxKey);
    }
    public static void majorityElement(int[] arr) {
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
        for(int i = 0 ; i< arr.length ; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i]) + 1);
            }
            else{
                map.put(arr[i], 1);
            }
        }
        int Maxfreq = Collections.max(map.values());
        for(Integer x : map.keySet()){
            if(map.get(x) == Maxfreq){
                System.out.println(x);
            }
            else {
                continue;
            }
        }

    }
}
