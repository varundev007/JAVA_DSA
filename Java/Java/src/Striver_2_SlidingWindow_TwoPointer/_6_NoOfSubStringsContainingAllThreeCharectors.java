package Striver_2_SlidingWindow_TwoPointer;
//     |0|1|2|3|4|5|
//     |b|b|a|c|b|a|          a b c
//     | |b|a|c| | |          2 1 3  = 1+ min(a b a )= 1+1 =2
//     | | |a|c|b| |          2 4 3  = 1+ min(a b c) = 1+2 =3
//     | | | |c|b|a|          5 4 3  = 1+ min(a b c)= 1+3  =4   => 2+3+5 = 9
public class _6_NoOfSubStringsContainingAllThreeCharectors {
    public static void main(String[] args) {
        String str = "bbacba";
        // 9
        int lastSeen[] = {-1, -1, -1};
        int count = 0;
        for (int i = 0 ; i < str.length() ; i++){
            char ch = str.charAt(i);
            lastSeen[ch- 'a'] = i;
            if (lastSeen[0] != -1 && lastSeen[1] != -1 && lastSeen[2] != -1 ){
                int minOf2 = Math.min(lastSeen[0] , lastSeen[1]);
                count = count + (1 + Math.min(minOf2, lastSeen[2]));
            }
        }
        System.out.println(count);
    }
}
