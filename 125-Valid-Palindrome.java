class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        s=s.replaceAll("[^a-z0-9]+","");
        if(s.length()==0){
            return true;
        }
        char a_pointer=s.charAt(0);
        char b_pointer=s.charAt(s.length()-1);
        for(int i=0;i<s.length();i++){
            if(a_pointer!=b_pointer){
                return false;
            }
            b_pointer=s.charAt(s.length()-1-i);
                a_pointer=s.charAt(0+i);
        }
        return true;
        
    }
}