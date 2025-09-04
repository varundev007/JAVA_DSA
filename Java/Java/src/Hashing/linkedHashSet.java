package Hashing;

import java.util.LinkedHashSet;

// follows order of insertion
public class linkedHashSet {
    public static void main(String[] args) {
        LinkedHashSet<String > lhs = new LinkedHashSet<>();
        lhs.add("delhi");
        lhs.add("mumbai");
        lhs.add("kol");
        lhs.add("bang");
        System.out.println(lhs);
    }
}
