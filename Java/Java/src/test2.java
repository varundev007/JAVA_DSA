import java.util.Arrays;
import java.util.HashMap;

public class test2 {
    public static void main(String[] args) {
        //this is my country India
        String s = "this is my country India  ";
        char arr[] = s.toCharArray();
        System.out.println(Arrays.toString(arr));
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0 ; i< arr.length ; i++){
            char ch = arr[i];
            if (map.containsKey(ch)){
                map.put(ch, map.get(ch) +1);
            }
            else {
                map.put(ch,1);
            }
        }
        for (Character ch : map.keySet()){
            if (map.get(ch)>1){
                System.out.println(ch);
            }
            else {
                continue;
            }
        }
    }
}
