class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();
        for(String word:strs){
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sortedWord = new String(chars);

            if(!map.containsKey(sortedWord)){
                List<String> arrStr = new ArrayList<>();
                map.put(sortedWord,arrStr);
            }
            map.get(sortedWord).add(word);
        }
        return new ArrayList<>(map.values());
    }
}