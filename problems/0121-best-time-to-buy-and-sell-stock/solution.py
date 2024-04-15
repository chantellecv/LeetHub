class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        l, r = 0, 1
        diff = 0

        while r < len(prices):
            if (prices[r] < prices[l]):
                l = r
            elif prices[r] - prices[l] > diff:
                diff = prices[r] - prices[l]
            r = r+1
        return diff
