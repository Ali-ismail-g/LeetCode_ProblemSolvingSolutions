class Solution {
    public int[] twoSum(int[] nums, int target) {
        int num1=0,num2=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j] == target){
                num1+=i;
                num2+=j;
                break;
            }
            }
        }
        int[] intArray = {num1,num2};
        return intArray; 
    }
}