1class Solution {
2    public boolean isValid(String s) {
3        Stack<Character> my_stack = new Stack<Character>();
4        for(char c:s.toCharArray()){
5            if(c=='('||c=='['||c=='{'){
6                my_stack.push(c);
7            }else{
8                if(my_stack.empty()){
9                    return false;
10                }else{
11                    char poped_element = my_stack.pop();
12                    if(poped_element != '{' && c=='}') return false;
13                    else if(poped_element != '[' && c==']') return false;
14                    else if(poped_element != '(' && c==')') return false;
15                }
16            }
17        }
18        return my_stack.empty();
19    }
20}