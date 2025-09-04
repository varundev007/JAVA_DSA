package _6_Coding_Interview_QUES_For_AutomationTesting;

public class _17_factorial_Using_recurssion {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(findFact(n));
    }
    public static int findFact(int n){

        if(n==1 || n==0){
            return 1;
        }
        return n* findFact(n-1);
    }
}
