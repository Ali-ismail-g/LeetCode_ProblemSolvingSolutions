class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length()==0) return true;
        int i=0,j=0;
        while(i<t.length()){
            if(t.charAt(i)==s.charAt(j)) j++;
            if(j==s.length()) return true;
            i++;
        }

        return false;
    }
}