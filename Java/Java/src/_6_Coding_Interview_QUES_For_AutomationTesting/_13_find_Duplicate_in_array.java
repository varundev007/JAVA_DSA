package _6_Coding_Interview_QUES_For_AutomationTesting;

import java.util.HashMap;

public class _13_find_Duplicate_in_array {
    public static void main(String[] args) {
        int arr[] = {3,4,5,6,7,8,3,6,78,6,5};
        findDup(arr);
    }
    public static void findDup(int arr[]){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0 ; i< arr.length ; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i]) + 1);
            }
            else{
                map.put(arr[i], 1);
            }
        }

        for(Integer i : map.keySet()){
            if(map.get(i) > 1){
                System.out.println("Duplicate elements are - " + i );
            }
            else {
                continue;
            }
        }
    }
}
