class Solution {
    public void reverseString(char[] s) {
        int n=s.length;
        int a_pointer=0;
        int b_pointer = n-1;
        while(a_pointer<=b_pointer){
            char temp = s[a_pointer];
            s[a_pointer] = s[b_pointer];
            s[b_pointer] = temp;
            a_pointer+=1;
            b_pointer-=1;
        }
        for(char c:s){
            System.out.print(c);
        }
         
    }
}