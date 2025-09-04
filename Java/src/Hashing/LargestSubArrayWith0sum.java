package Hashing;

import java.util.HashMap;

public class LargestSubArrayWith0sum {
    public static void main(String[] args) {
        int arr[]={15,14,1,-15,-2, 2, -8,8, 1, 7, 10, 23};
        //(sum.idx)
        //solving in O(N)
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int len = 0;
        for(int i=0; i<arr.length; i++){
            sum=sum + arr[i];
            if(map.containsKey(0)){
                map.put(0,i);
            }

            if(map.containsKey(sum)){
                len = Math.abs(i- map.get(sum));
            }
            else{
                map.put(sum, i);
            }
        }
        System.out.println("Length of largest sub array with 0 sum -> "+ len);
    }
}
