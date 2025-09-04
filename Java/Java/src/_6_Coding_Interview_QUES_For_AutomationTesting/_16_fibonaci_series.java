package _6_Coding_Interview_QUES_For_AutomationTesting;

public class _16_fibonaci_series {
    public static void main(String[] args) {
        int n = 10;
  //      0 1 1 2 3 5 8
        System.out.println(findFibo(n));
    }
    public static int  findFibo(int n ){
        if(n==1){
            return 0;
        }
        if (n ==2){
            return 1;
        }
        return findFibo(n-1) + findFibo(n-2);
    }
}