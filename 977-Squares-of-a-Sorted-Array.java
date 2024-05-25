class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] ans = new int[nums.length];
        int right_pointer = nums.length-1;
        int left_pointer = 0;
        for(int i=nums.length-1;i>=0;i--){
            if(Math.abs(nums[left_pointer])>Math.abs(nums[right_pointer])){
                ans[i] = nums[left_pointer] * nums[left_pointer];
                left_pointer++;
            }else if(Math.abs(nums[left_pointer])<Math.abs(nums[right_pointer])){
                ans[i] = nums[right_pointer] * nums[right_pointer];
                right_pointer--;
            }else if(Math.abs(nums[left_pointer])==Math.abs(nums[right_pointer])){
                ans[i] = nums[right_pointer] * nums[right_pointer];
                right_pointer--;
            }
        }
        return ans;

    }
}