class Solution {
    public int arraySign(int[] nums) {
        int count_neg=0;
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                return 0;
            }else if(nums[i]<0){
                count_neg+=1;
            }
        }
        if(count_neg % 2 ==0){
            return 1;
        }
        return -1;

    }
}