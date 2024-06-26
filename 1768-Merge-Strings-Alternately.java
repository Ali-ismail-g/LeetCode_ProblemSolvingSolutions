class Solution {
    public String mergeAlternately(String word1, String word2) {
        int n1 = word1.length();
        int n2 = word2.length();
        String ans = "";
        StringBuffer sb = new StringBuffer(ans);
        if(n1>n2){
            for(int i=0;i<n2;i++){
                sb.append(word1.charAt(i));
                sb.append(word2.charAt(i));
            }
            sb.append(word1.substring(n2,n1));
        }else if(n2>n1){
            for(int i=0;i<n1;i++){
                sb.append(word1.charAt(i));
                sb.append(word2.charAt(i));
            }
            sb.append(word2.substring(n1,n2));
        }else if(n2==n1){
            for(int i=0;i<n2;i++){
                sb.append(word1.charAt(i));
                sb.append(word2.charAt(i));
            }
        }



        ans = sb.toString();
        return ans;
    }
}