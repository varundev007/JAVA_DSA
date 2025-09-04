package Hashing;

import java.util.HashSet;

public class countDistinctElement {
    public static void main(String[] args) {
        int num[]= {4,3,2,5,6,7,3,4,2,1};
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<num.length; i++){
            set.add(num[i]);
        }
        System.out.println("Total distinct number- " +set.size());
    }
    // By using this it took O(n) time
    // By briteforce it takes O(n^2) time
}
