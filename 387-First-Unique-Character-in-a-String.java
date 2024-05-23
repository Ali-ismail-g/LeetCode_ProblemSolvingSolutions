class Solution {
    public int firstUniqChar(String s) {
        Map<Character,Integer> mp = new HashMap<Character,Integer>();

        for(char c:s.toCharArray()){
            if(mp.containsKey(c)){
                mp.put(c,mp.get(c)+1);
            }else{
                mp.put(c,1);
            }
        }
        char myChar = '\0';
        
        for(int i=0;i<s.length();i++){
            if(mp.get(s.charAt(i))==1){
                 return i;
            }
        }
        return -1;
    }
}