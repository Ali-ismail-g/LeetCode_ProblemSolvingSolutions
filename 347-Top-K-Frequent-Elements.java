class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int ele : nums){
            map.put(ele,map.getOrDefault(ele,0)+1);
        }
        PriorityQueue<Map.Entry<Integer,Integer>> pq =new PriorityQueue<>(Map.Entry.comparingByValue(Comparator.reverseOrder()));
        for(Map.Entry entry : map.entrySet()){
            pq.add(entry);
        }
        int[] ans = new int[k];
        for(int i=0;i<k;i++){
            ans[i] = pq.poll().getKey();
        }
        return ans;
    }
}