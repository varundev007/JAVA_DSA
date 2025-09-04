package DPpart_1;

public class knapsack {
    public static void main(String[] args) {
            int val[] ={15, 14, 10, 45, 30};
            int wt[]= {2, 5, 1,3, 4};
            int w=7; //total weight allowed and find find max profit
            int n = val.length;
        System.out.println(maxProfit(val,wt,w,n));
    }
    public static int maxProfit(int val[],  int wt[], int w, int n){
        if(n==0 ||w==0){
            return 0;
        }
        if(wt[n-1]<= w){
            int choice1 = val[n-1]+ maxProfit(val, wt, w- wt[n-1],n-1);// when selected
            int choice2= maxProfit(val, wt, w, n-1);
            return Math.max(choice1, choice2);
        }
        else{
            return maxProfit(val, wt, w, n-1);
        }
    }
}
