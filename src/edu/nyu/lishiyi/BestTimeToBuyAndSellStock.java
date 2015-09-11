Best Time to Buy and Sell Stock 
My Submissions Question Solution 
Total Accepted: 63719 Total Submissions: 192396 Difficulty: Medium
Say you have an array for which the ith element is the price of a given stock on day i.

If you were only permitted to complete at most one transaction
(ie, buy one and sell one share of the stock), 
design an algorithm to find the maximum profit.

public class Solution {
    public int maxProfit(int[] prices) {
        
        if(prices == null || prices.length == 0 || prices.length == 1){

        	return 0;
        }
        //create an array profit for saving each day's max profit.
        int[] profit = new int[prices.length];
        profit[0] = 0;
        //Save min price
        int min = prices[0];

        for(int i = 1; i < prices.length; i++){
        	//compare latest profit and the new max profit, which is larger
        	profit[i] = Math.max(profit[i - 1], prices[i] - min);
        	//If the new price is smaller than the min, set it.
        	min = Math.min(min, prices[i]);
        }

        return profit[prices.length - 1];
    }
}