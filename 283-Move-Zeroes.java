class Solution {
    public void moveZeroes(int[] nums) {
        
        int left_pointer = 0;
        for(int right_pointer = 0;right_pointer<nums.length;right_pointer++){
            if(nums[right_pointer]!=0){
                int temp;
                temp = nums[right_pointer];
                nums[right_pointer] = nums[left_pointer];
                nums[left_pointer] = temp;
                left_pointer++;
            }
        }
    }
}