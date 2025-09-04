package _7_leetcode_Top150_Problem;
/*
Example 1:

Input: prices = [7,1,5,3,6,4]
Output: 7
Explanation: Buy on day 2 (price = 1) and sell on day 3 (price = 5), profit = 5-1 = 4.
Then buy on day 4 (price = 3) and sell on day 5 (price = 6), profit = 6-3 = 3.
Total profit is 4 + 3 = 7.
Example 2:

Input: prices = [1,2,3,4,5]
Output: 4
Explanation: Buy on day 1 (price = 1) and sell on day 5 (price = 5), profit = 5-1 = 4.
Total profit is 4.
 */
public class _7_best_time_to_but_and_sell_stocks_part2 {
    public static void main(String[] args) {
        int price[] ={7,1,5,3,6,4};
        System.out.println(findMaxProfit(price));
    }
    public static int findMaxProfit(int price[]){
        int maxProfit = 0;
        for (int i =1 ; i< price.length ; i++){
            if(price[i] > price[i-1]){
                maxProfit = maxProfit + (price[i] -price[i-1]);
            }
            else {
                continue;
            }
        }
        return maxProfit;
    }

}
