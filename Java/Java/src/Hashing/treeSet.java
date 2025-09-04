package Hashing;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;

// maintain sorted order in asending order
// implementation done using Treemaps which used redblack tree (slef balncing bst)
// NULL values not allowed
// insert, remove, = O(logN)
public class treeSet {
    public static void main(String[] args) {
        HashSet<String> city= new HashSet<>();
        city.add("delhi");
        city.add("mumbai");
        city.add("kol");
        city.add("bang");
        System.out.println(city);

        LinkedHashSet<String> lhs= new LinkedHashSet<>(0);
        lhs.add("delhi");
        lhs.add("mumbai");
        lhs.add("kol");
        lhs.add("bang");
        System.out.println(lhs);

        TreeSet<String> ts = new TreeSet<>();
        ts.add("delhi");
        ts.add("mumbai");
        ts.add("kol");
        ts.add("bang");
        System.out.println(ts);



    }
}
