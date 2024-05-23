class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer,Integer> mp = new HashMap<Integer,Integer>();
        int value=0;
        for(int i=0;i<nums.length;i++){
            if(mp.containsKey(nums[i])){
                mp.put(nums[i],mp.get(nums[i])+1);
            }else{
                mp.put(nums[i],1);
            }
        }
        for(Map.Entry entry:mp.entrySet()){
            if(((Integer)entry.getValue())==1){
                value = ((Integer)entry.getKey());
            }
        }
        return value;
    }
}