package Hashing;

import java.util.HashMap;
import java.util.Set;

public class IterationInHashMaps {
    public static void main(String[] args) {
        HashMap<String,Integer> hm =new HashMap<>();
        hm.put("India",150);
        hm.put("Australia",10);
        hm.put("Nepal",5);
        hm.put("Pakistan",25);
        hm.put("China",140);
        System.out.println(hm);
        //Iterate
        Set<String> keys=hm.keySet();
        System.out.println(keys);
        for(String k : keys){
            System.out.println("keys- "+ k+ " Value-" +hm.get(k));
        }

    }
}
