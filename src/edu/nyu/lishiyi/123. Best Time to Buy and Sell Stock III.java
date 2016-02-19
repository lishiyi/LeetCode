123. Best Time to Buy and Sell Stock III 
My Submissions Question
Total Accepted: 51583 Total Submissions: 200989 Difficulty: Hard
Say you have an array for which the ith element is the price of a given stock on day i.

Design an algorithm to find the maximum profit. You may complete at most two transactions.

Note:
You may not engage in multiple transactions at the same time 
(ie, you must sell the stock before you buy again).

public class Solution {
    public int maxProfit(int[] prices) {
        
        if(prices == null || prices.length <= 1) return 0;

        int len = prices.length;
        int[] dp1 = new int[len];
        int[] dp2 = new int[len];

        int min = prices[0];
        int result = 0;
        for(int i = 0; i < len; i++){
        	result = result > prices[i] - min ? result : prices[i] - min;
        	min = min < prices[i] ? min : prices[i];
        	dp1[i] = result;
        }

        int max = prices[len - 1];
        result = 0;
        for(int i = len - 1; i >= 0; i--){
        	result = result > max - prices[i] ? result : max - prices[i];
        	max = max > prices[i] ? max : prices[i];
        	dp2[i] = result;
        }

        result = 0;
        for(int i = 0; i < len; i++){
        	result = result > dp1[i] + dp2[i] ? result : dp1[i] + dp2[i];
        }
        return result;
    }
}