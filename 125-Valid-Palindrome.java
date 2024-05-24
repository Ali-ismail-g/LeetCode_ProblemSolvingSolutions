class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        s=s.replaceAll("[^a-z0-9]+","");
        StringBuilder pal = new StringBuilder();
        for(int i=s.length()-1;i>=0;i--){
            pal.append(s.charAt(i));
        }
        return pal.toString().equals(s);
        
    }
}