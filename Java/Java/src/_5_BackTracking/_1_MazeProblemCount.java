package _5_BackTracking;

public class _1_MazeProblemCount {
    public static void main(String[] args) {
        System.out.println(countWays(3, 3));
    }
    public static int countWays(int rows, int colmns){
        if (rows == 1 || colmns == 1){
            return 1;
        }
        int right = countWays(rows, colmns-1);
        int dowm = countWays(rows-1, colmns);
        return right + dowm;
    }
}
