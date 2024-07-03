class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<operations.length;i++){
            if(operations[i].equals("C")){
                stack.pop();
            }else if(operations[i].equals("D")){
                int x =stack.pop();
                stack.push(x);
                stack.push(2*x);
            }else if(operations[i].equals("+")){
                int x = stack.pop();
                int y = stack.pop();
                int z = x+y;
                stack.push(y);
                stack.push(x);
                stack.push(z);
            }else{
                stack.push(Integer.parseInt(operations[i]));
            }
        }
        int sum=0;
        while(!stack.empty()){
            sum+=stack.pop();
        }
        return sum;
    }
}