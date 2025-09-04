package Hashing;

import java.util.HashSet;

//no duplicate
//unordered
//NULL is allowed
//Hshset is implemented using hashmaps
//add(key), contains(key), remove(key) - O(1)
public class hashSet {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(3);
        set.add(5);
        set.add(1);
        set.add(2);
        set.add(3);
        System.out.println(set);
        set.remove(2);
        if(set.contains(3)){
            System.out.println("contains 3");
        }
        if(set.contains(2)){
            System.out.println("contains 2");
        }
        set.clear(); // to clear set
        System.out.println(set);
        System.out.println(set.size());
        System.out.println(set.isEmpty());
    }
}
