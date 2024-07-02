class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> nums1Set = Arrays.stream(nums1).boxed().collect(Collectors.toSet());
        Set<Integer> nums2Set = Arrays.stream(nums2).boxed().collect(Collectors.toSet());
        List<Integer> ansList1 = new ArrayList<>();
        List<Integer> ansList2 = new ArrayList<>();
        List<List<Integer>> ansList = new ArrayList<>();

        nums1Set.forEach(el->{
            if(!nums2Set.contains(el)){
                ansList1.add(el);
            }
        });
        ansList.add(ansList1);
        nums2Set.forEach(el->{
            if(!nums1Set.contains(el)){
                ansList2.add(el);
            }
        });
        ansList.add(ansList2);
        return ansList;
    }
}