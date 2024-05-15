class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] new_nums = new int[n*2];
        for(int i=0;i<n;i++){
            new_nums[i*2] = nums[i];
            new_nums[i*2+1] = nums[i+n];
        }
        return new_nums;
    }
}