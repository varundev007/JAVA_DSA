package Striver_1_Arrays;
//int arr[] = {1, 2, 3, -3, 1, 1, 1, 1, 4,2,-3};
// k=3, ans =8;
// O(n logn)
// O(n)
import java.util.HashMap;

public class _23_CountSunarraysSumEqualK {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, -3, 1, 1, 1, 1, 4,2,-3};
        int k =3;
        int cnt =0 ;
        int preSum=0;
        HashMap<Integer, Integer> map =new HashMap<>();
        map.put(0,1);
        for(int i =0 ; i< arr.length ;i++){
            preSum = preSum +arr[i];
            int rest= preSum -k;
            if (map.containsKey(preSum)){
                map.put(preSum, map.get(preSum)+1);
            }
            else {
                map.put(preSum,1);
            }
            if (map.containsKey(rest)){
                cnt = cnt + map.get(rest);
            }
        }
        System.out.println(cnt);
    }
}
