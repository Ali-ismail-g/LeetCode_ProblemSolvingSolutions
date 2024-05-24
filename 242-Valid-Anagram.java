class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        Map<Character,Integer> mp= new HashMap<Character,Integer>();
        
         for(char x:s.toCharArray()){
            mp.put(x,mp.getOrDefault(x,0)+1); 
         }
         for(char x:t.toCharArray()){
            mp.put(x,mp.getOrDefault(x,0)-1);
         }
         for(int val:mp.values()){
            if(val!=0){
                return false;
            }
         }
         return true;
    }
}