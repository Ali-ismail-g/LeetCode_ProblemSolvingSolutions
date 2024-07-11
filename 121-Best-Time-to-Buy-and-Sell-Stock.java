class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minPrice = 1000000;
        for(int i=0;i<prices.length;i++){
            if(prices[i] < minPrice){
                minPrice=prices[i];
                continue;
            }
            maxProfit = Math.max(maxProfit,prices[i]-minPrice);
        }
        return maxProfit;
    }
}