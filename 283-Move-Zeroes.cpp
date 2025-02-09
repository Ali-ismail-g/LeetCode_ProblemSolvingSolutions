class Solution {
public:
    void moveZeroes(vector<int>& nums) {
        int leftPointer=0;
        int rightPointer=0;
        for(int rightPointer=0; rightPointer<nums.size(); rightPointer++ ){
            if(nums[rightPointer] != 0){
                swap(nums[leftPointer],nums[rightPointer]);
                leftPointer++;
            }
        }
    }
};