package _4_Strings_Recursion_Loop;

public class _6_SumOfAnumberInAdice {
    public static void main(String[] args) {
        int target = 4;
        diceSum("", target);

    }
    public static void diceSum(String p, int target){
        if (target == 0 ){
            System.out.println(p);
            return;
        }
        for (int i =1 ; i<=6 && target >=0 ; i++){
            diceSum(p+i, target-i);
        }
    }
}
