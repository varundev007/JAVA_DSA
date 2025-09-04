package _1_Recursion;

public class _5_numberOfStepsToReduceNumberToZero {
    public static void main(String[] args) {
        int n = 14;
        System.out.println(countStep(n,0));
    }
    public static int countStep(int n , int count){
        if(n == 0){
            return count;
        }
        if(n%2 == 0){
            return countStep(n/2,count+1);
        }
        return countStep(n-1,count+1);
    }
}
