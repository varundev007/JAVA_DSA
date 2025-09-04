package Striver_1_Arrays;

import java.util.HashMap;
//majority element = count od a number > arr.lemgth/2
public class _13_majotityElement_HashMap {
    public static void main(String[] args) {
        int arr[] = {2,2,1,3,1,1,3,1,1};
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i=0 ; i < arr.length ; i++){
            if (map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i]) + 1);
            }
            else {
                map.put(arr[i], 1);
            }
        }
       for (int key : map.keySet()){
           if (map.get(key) > arr.length/2){
               System.out.println(key);
           }
       }
    }
}
