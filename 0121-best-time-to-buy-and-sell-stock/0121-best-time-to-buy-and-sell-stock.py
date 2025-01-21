class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        minprice = prices[0]
        maxprofit =0
        for i in range(1,len(prices)-1,1):
            if prices[i] < minprice:
                minprice = prices[i]
            else:
                profit = prices[i] - minprice
                maxprofit = max(profit,maxprofit)
        return maxprofit

        