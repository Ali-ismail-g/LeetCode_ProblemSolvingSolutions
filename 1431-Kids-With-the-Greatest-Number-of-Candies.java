class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> result = new ArrayList<>();
        int maxNum = 0;
        int n = candies.length;
        for(int i=0;i<n;i++){
            if(candies[i]>maxNum){
                maxNum = candies[i];
            }
        }
        int sum_can=0;
        for(int i=0;i<n;i++){
            sum_can = extraCandies+candies[i];
            if(sum_can>=maxNum)
                result.add(true);
            else
                result.add(false);
        }
        return result;
    }
}