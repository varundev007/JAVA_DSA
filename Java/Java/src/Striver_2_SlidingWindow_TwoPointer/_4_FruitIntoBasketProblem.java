package Striver_2_SlidingWindow_TwoPointer;

import java.util.HashMap;

//You want to collect as much fruit as possible by picking a
// continuous subarray (subsequence of adjacent elements) containing at most 2 types of fruits.
// {3, 3, 3, 1, 2, 1, 1, 2, 3, 3, 4}
// {1, 2, 1, 1, 2} => 5
public class _4_FruitIntoBasketProblem {
    public static void main(String[] args) {
        int arr[] = {3, 3, 3, 1, 2, 1, 1, 2, 3, 3, 4};
        System.out.println(findMaxFruit(arr));
    }
    public static int findMaxFruit(int[] arr){
        int left = 0;
//        int right = 0;
        int maxFruit = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int right= 0 ; right <arr.length ; right++){
            int fruit = arr[right];
            if (map.containsKey(fruit)){
                map.put(fruit, map.get(fruit) + 1);
            }
            else {
                map.put(fruit,1);
            }
            // Shrink window if more than 2 types of fruits
            while (map.size() > 2){
                int leftFruit = arr[left];
                map.put(leftFruit, map.get(leftFruit) - 1);
                if (map.get(leftFruit) == 0){
                    map.remove(leftFruit);
                }
                left++;
            }
            maxFruit = Math.max(maxFruit, right - left +1);
        }
        return maxFruit;
    }
}
