package _1_Recursion;

public class _2_sumOfDigits {
    public static void main(String[] args) {
        int num =1324;
  //      System.out.println(sum(num));
        System.out.println(prod(num));
    }

    public static int sum(int num){
        if(num ==0){
            return 0;
        }
        return num%10 + sum(num/10);
    }
    public static int prod(int num){
        if(num%10 ==num){
            return num;
        }
        return num%10 * prod(num / 10);
    }
}
