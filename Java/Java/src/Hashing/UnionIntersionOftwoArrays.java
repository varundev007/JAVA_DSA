package Hashing;

import java.util.HashSet;

public class UnionIntersionOftwoArrays {
    public static void main(String[] args) {
        int arr1[] = {7, 3, 9};
        int arr2[] = {6, 3, 9, 2, 9, 4};
        HashSet<Integer> set1= new HashSet<>();
        for(int i=0 ; i < arr1.length ; i++ ){
            set1.add(arr1[i]);
        }
        HashSet<Integer> set2 = new HashSet<>();
        for(int i=0 ; i< arr2.length ; i++){
            set2.add(arr2[i]);
        }
        HashSet<Integer> combinedHashset = new HashSet<>();
        combinedHashset.addAll(set1);
        combinedHashset.addAll(set2);
        System.out.println("Size od Union array -" +combinedHashset.size()+ "   Elements- " + combinedHashset);
        // Intersection
        int count=0;
        for(int i = 0 ; i<arr2.length ; i++){
            if (set1.contains(arr2[i])){
                count++;
                System.out.print(" "+arr2[i]);
                set1.remove(arr2[i]);
            }
        }
        System.out.println(" Count in Intersection-> " +count);
    }
}
