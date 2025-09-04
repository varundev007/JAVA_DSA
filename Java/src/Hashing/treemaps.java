package Hashing;

import java.util.TreeMap;

public class treemaps {
    public static void main(String[] args) {
        // key are sorted
        // put, get .remove -  O(log(N))
        // implemenation-> red black (self balancing bst)
        TreeMap<String, Integer> tm= new TreeMap<>();
        tm.put("India",150);
        tm.put("China", 140);
        tm.put("Pak", 25);
        tm.put("Aus",10);
        tm.put("Nepal", 15);
        System.out.println(tm); //sorted in alphabetical order

    }
}
