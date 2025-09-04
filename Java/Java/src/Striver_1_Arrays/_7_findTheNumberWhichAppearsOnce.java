package Striver_1_Arrays;

import java.util.HashMap;

//{1,1,2,3,3,4,4}
//ans- 2
public class _7_findTheNumberWhichAppearsOnce {
    public static void main(String[] args) {
        int arr[] = {1,1,2,3,3,4,4};
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i=0; i<arr.length ; i++){
            if (map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);
            }
            else {
                map.put(arr[i],1);
            }
        }

        for (int key: map.keySet()){
            if (map.get(key)==1){
                System.out.println(key);
                break;
            }
        }
    }
}
