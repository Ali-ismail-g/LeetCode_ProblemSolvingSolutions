class Solution {
    public boolean isAcronym(List<String> words, String s) {
        int lenString = s.length();
        int lenList = words.size();
        if(lenList == 0 || lenString == 0 || lenString != lenList)
        {
            return false;
        }
        for(int i=0;i<lenList;i++){
            if(words.get(i).charAt(0) != s.charAt(i)){
                return false;
            }
        }

        return true;
    }
}