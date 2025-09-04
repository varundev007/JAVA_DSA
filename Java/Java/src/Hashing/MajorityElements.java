package Hashing;

import java.util.HashMap;
import java.util.Set;

public class MajorityElements {
    public static void main(String[] args) {
        int arr[]={1,3,2,5,1,3,1,5,1};
        //to print values whose frequency is less than N/3
        HashMap<Integer, Integer> hm= new HashMap<>();
        for (int i=0; i < arr.length; i++){
//            if(hm.containsKey(arr[i])){
//                hm.put(arr[i], hm.get(arr[i]) + 1); //increasing frequency by 1
//            }
//            else{
//                hm.put(arr[i],1);
//            }
   //         hm.put(arr[i],hm.getOrDefault(arr[i],0)+1 );
            if(!hm.containsKey(arr[i])){
                hm.put(arr[i],1);
            }
            else{
                hm.put(arr[i], hm.get(arr[i])+1);
            }
            Set<Integer> keySet= hm.keySet();
            for(Integer key: keySet){
                if(hm.get(key) > arr.length/3){
                    System.out.println(key);
                }
            }
        }
    }
}
