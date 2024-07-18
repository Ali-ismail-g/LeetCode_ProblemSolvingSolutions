class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(stack.isEmpty()){
                stack.push(s.charAt(i));
            }else if(!stack.isEmpty() && stack.peek()!= s.charAt(i)){
                stack.push(s.charAt(i));
            }else if(stack.peek()== s.charAt(i)){
                stack.pop();
            }
        }
        for(Character ch : stack){
            sb.append(ch);
        }
        return sb.toString();
    }
}