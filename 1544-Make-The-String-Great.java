class Solution {
    public String makeGood(String s) {
        char[] str_arr = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<str_arr.length;i++){
            if(!stack.isEmpty()&& Math.abs(stack.peek()-str_arr[i])==32){
                stack.pop();
            }else{
                stack.push(str_arr[i]);
            }
        }
        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        return sb.reverse().toString();
    }
}