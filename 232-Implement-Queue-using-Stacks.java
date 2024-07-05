class MyQueue {
    Stack<Integer> q;
    Stack<Integer> helper;
    private int top;
    public MyQueue() {
        q = new Stack();
        helper = new Stack();
    }
    
    public void push(int x) {
        if(q.isEmpty()){
            top = x;
        }
        while(!q.isEmpty()){
            helper.push(q.pop());
        }
        helper.push(x);
        while(!helper.isEmpty()){
            q.push(helper.pop());
        }

    }
    
    public int pop() {
        int res = q.pop();
        if(!q.isEmpty()){
            top = q.peek();
        }
        return res;
    }
    
    public int peek() {
        return top;
    }
    
    public boolean empty() {
        return q.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */