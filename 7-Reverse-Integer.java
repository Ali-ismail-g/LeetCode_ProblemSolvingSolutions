class Solution {
    public int reverse(int x) {
        int pop=0,rev=0,flag=0;
        if(x<0){
            x*=-1;
            flag =1;
        }
        while(x>0){
            pop=x%10;
            x/=10;
            if(rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)){
            return 0;
        }else if(rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)){
            return 0;
        }
        rev=rev*10+pop;
            
        }
        
        if(flag ==1){
            return rev*-1;
        }
        return rev;
    }
}