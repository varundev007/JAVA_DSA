package _7_leetcode_Top150_Problem;
/*
Example 1:

Input: prices = [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
Example 2:

Input: prices = [7,6,4,3,1]
Output: 0
Explanation: In this case, no transactions are done and the max profit = 0.
 */
public class _6_best_time_to_buy_and_sell_stocks {
    public static void main(String[] args) {
       // int price[] = {7,1,5,3,6,4};
        int price[] ={1,2,3,4,5,6,7};
        System.out.println(FindMaxProfit(price));
    }
    public static int FindMaxProfit(int price[]){
        int minPrice = Integer.MAX_VALUE;
        int  maxProfit = Integer.MIN_VALUE;
        for(int i = 0 ; i< price.length ; i++){
            if(minPrice > price[i]){
                minPrice = price[i];
            } else if (price[i] - minPrice > maxProfit) {
                maxProfit= price[i] - minPrice;
            }
        }
        return maxProfit;
    }
}
