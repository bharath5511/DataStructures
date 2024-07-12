package com.example.search.leetcode;

//Input: prices = [7,1,5,3,6,4]
//        Output: 5
//        Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
//        Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
public class StocBuyandSell {
    public static void main(String[] args) {
        int[] arr = {7,1,5,3,6,4};
//        int[] arr = {2,4,1};
//        int[] arr = {7,6,4,3,1};
        System.out.println(maxProfit(arr));
    }

    public static int maxProfit(int[] prices) {

        int n = prices.length;
        int buy = prices[0], max_profit = 0;
        for (int i = 1; i < n; i++) {

            if (buy > prices[i])
                buy = prices[i];

            else if (prices[i] - buy > max_profit)
                max_profit = prices[i] - buy;
        }
        return max_profit;

    }
}
