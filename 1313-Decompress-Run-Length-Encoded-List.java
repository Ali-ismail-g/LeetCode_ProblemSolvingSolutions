class Solution {
    public int[] decompressRLElist(int[] nums) {
        List<Integer> list = new ArrayList<Integer>();
        for(int i=0;i<nums.length;i+=2){
            for(int j=0;j<nums[i];j++){
                list.add(nums[i+1]);
            }
        }
        
        int[] arr = new int[list.size()];
        for(int i=0;i<list.size();i++){
            arr[i] =list.get(i);
        }
        return arr;
    }
}