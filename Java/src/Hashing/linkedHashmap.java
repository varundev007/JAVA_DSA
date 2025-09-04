package Hashing;

import java.util.LinkedHashMap;
import java.util.LinkedList;

public class linkedHashmap {
    public static void main(String[] args) {
        //Only difference from hm is
        // 1 - output in input order
        // 2 - in lhm implementation done thorough Arrays of doubly linked list
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
        lhm.put("India ", 150);
        lhm.put("China ", 140);
        lhm.put("pakistan", 25);
        lhm.put("Nepal", 15);
        lhm.put("Aus", 10);
        System.out.println(lhm);

    }
}
