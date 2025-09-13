class Solution {
    public boolean containsDuplicate(int[] nums) {
        int n = nums.length;
        // Set<Integer> uniqueNumbers = Arrays.stream(nums)
        //                                     .boxed().collect(Collectors.toSet());
        Set<Integer> uniqueNumbers = new HashSet<>();
        for(int i : nums){
            uniqueNumbers.add(i);
        }
        int u = uniqueNumbers.size();
        if(n == u) return false;
        return true;
    }
}