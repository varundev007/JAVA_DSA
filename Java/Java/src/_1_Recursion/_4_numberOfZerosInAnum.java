package _1_Recursion;

public class _4_numberOfZerosInAnum {
    public static void main(String[] args) {
        int n =10040500;
        System.out.println(countZeros(n,0));

    }
    public static int countZeros(int n, int count){
        if(n%10 == n){
            return count;
        }
        if(n%10 == 0){
           return countZeros(n/10, count+1);
        }
        return countZeros(n/10,count);

    }
}
