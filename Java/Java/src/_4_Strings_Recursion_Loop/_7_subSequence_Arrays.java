package _4_Strings_Recursion_Loop;

import java.util.ArrayList;
import java.util.List;

//                         [1,2,3]
//                       [ [], [1] ]
//                  [ [], [1], [2] , [1,2] ]
//          [ [], [1], [2] , [1,2] , [3], [1,3], [2,3] , [1,2,3]]
public class _7_subSequence_Arrays {
    public static void main(String[] args) {
        int arr[] = {1,2,3};
        System.out.println(subSeq(arr));
        System.out.println(subSeqForDuplicates(new int[]{1,2,2}));
    }

    public static List<List<Integer>> subSeq(int arr[]){
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        for (int num : arr){
            int n = outer.size();
            for (int i = 0; i< n ; i++){
                List<Integer> inner = new ArrayList<>(outer.get(i));
                inner.add(num);
                outer.add(inner);
            }
        }
        return outer;
    }

    public static List<List<Integer>> subSeqForDuplicates(int arr[]){
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());

        for (int num : arr){
            int n = outer.size();
            for (int i = 0; i < n; i++){
                List<Integer> inner = new ArrayList<>(outer.get(i));
                inner.add(num);

                // ✅ only add if not already present
                if (!outer.contains(inner)) {
                    outer.add(inner);
                }
            }
        }
        return outer;
    }
}
