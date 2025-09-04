package Hashing;
import java.util.*;
public class Hashmaps {
    public static void main(String[] args) {
        //CREATE
        HashMap<String, Integer> hm = new HashMap<>();
        //INSERT-O(1)
        hm.put("India", 150);
        hm.put("China",140);
        hm.put("US", 50);
        System.out.println(hm);

        //get- O(1)
//        int a = hm.get("India");
//        System.out.println(a); //Underordered output
//
//        //containsKey- O(1)
//        System.out.println(hm.containsKey("India"));
//        System.out.println(hm.containsKey("Pak"));

//        //remove- O(1)
//        System.out.println(hm.remove("China"));
//        System.out.println(hm);
//        System.out.println(hm.remove("Nepal"));
        //size
        System.out.println(hm.size());

        //isEmpty
        System.out.println(hm.isEmpty());
        hm.clear();
        System.out.println(hm.isEmpty());
    }
}
