package DPpart_1;

import java.util.Arrays;

// Count ways to reach the nth stairs. a person can climb only 1 or 2 stairs at a time
public class ClimbingStairs {
    public static void main(String[] args) {
        int n =5 ;// n=3-> 3 , n=4 -> 5  ->8
        System.out.println(countWays(n));
        int ways[]= new int[n+1];// 0 0 0 0 0
        Arrays.fill(ways,-1);// -1 -1 -1 -1 -1
        System.out.println(countWaysMemo(n,ways));
        System.out.println(countWaytabu(n));
    }
    //recursion- O(N^2)
    public static int countWays(int n){
        if(n==0){
            return 1;
        }
        if(n<0){
            return 0;
        }
        return countWays(n-1)+countWays(n-2);
    }
    //MEMOIZATION- O(N)
    public static int countWaysMemo(int n, int ways[]){
        if(n==0){
            return 1;
        }
        if(n<0){
            return 0;
        }
        if(ways[n]!= -1){// already calculated
            return ways[n];
        }
        ways[n]= countWaysMemo(n-1,ways) + countWaysMemo(n-2, ways);
        return ways[n];
    }
    //TABULATION -
    public static int countWaytabu(int n){
        int ways[] = new int[n+1];
        ways[0]=1;
        for(int i=1 ; i<=n ; i++){
            if(i==1){
                ways[i]= ways[i-1]+0;
            }
            else {
                ways[i]= ways[i-1] +ways[i-2];
            }
        }
        return ways[n];
    }
}

