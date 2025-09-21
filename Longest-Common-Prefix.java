class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        Arrays.sort(strs);
        int n = strs.length;
        int minLength = Math.min(strs[0].length(),strs[n-1].length());
        String ans = "";
        StringBuffer buffer = new StringBuffer(ans);
        for(int i=0;i<minLength;i++){
            if(strs[0].charAt(i)!= (strs[n-1].charAt(i))){
                return buffer.toString();
            }
            buffer.append(strs[0].charAt(i));
        }
        return buffer.toString();
    }
}