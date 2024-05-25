class Solution {
    public boolean isValid(String s) {
        Stack<Character> my_stack = new Stack<Character>();
        for(char c:s.toCharArray()){
            if(c=='('||c=='['||c=='{'){
                my_stack.push(c);
            }else{
                if(my_stack.empty()){
                    return false;
                }else{
                    char poped_element = my_stack.pop();
                    if(poped_element != '{' && c=='}') return false;
                    else if(poped_element != '[' && c==']') return false;
                    else if(poped_element != '(' && c==')') return false;
                }
            }
        }
        return my_stack.empty();
    }
}