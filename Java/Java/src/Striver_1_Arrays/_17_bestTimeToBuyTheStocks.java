package Striver_1_Arrays;

public class _17_bestTimeToBuyTheStocks {
    public static void main(String[] args) {
        int arr[] = {7, 1, 5, 3, 6, 4};
        int mini = arr[0];
        int maxProfit=0;
        int profit;
        for (int i = 1; i < arr.length ; i++){
            profit = arr[i] - mini;
            maxProfit = Math.max( maxProfit, profit);
            mini = Math.min(mini, arr[i]);
        }
        System.out.println(maxProfit);
    }
}
