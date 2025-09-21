class Solution {
    public String longestCommonPrefix(String[] strs) {
        // if(strs.length == 0 || strs == null){
        //     return \\;
        // }
        // String prefix = strs[0];
        // for(int i=1;i<strs.length;i++){
        //     String s = strs[i];
        //     int j=0;
        //     while(j<prefix.length() && j<s.length() && prefix.charAt(j) == s.charAt(j)){
        //         j+=1;
        //     }
        //     prefix = prefix.substring(0,j);
        //     if(prefix.length() == 0){
        //         break;
        //     }
        // }
        // return prefix;
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
