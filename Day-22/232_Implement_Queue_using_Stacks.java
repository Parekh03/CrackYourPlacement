class MyQueue {

    private Stack<Integer> st1 = new Stack<>();
    private Stack<Integer> st2 = new Stack<>();

    public MyQueue() {
        
    }
    
    public void push(int x) {
        while(!st1.isEmpty()){
            int ele = st1.pop();
            st2.push(ele);
        }

        st1.push(x);

        while(!st2.isEmpty()){
            int ele = st2.pop();
            st1.push(ele);
        }
    }
    
    public int pop() {
        return st1.pop();
    }
    
    public int peek() {
        return st1.peek();
    }
    
    public boolean empty() {
        return st1.isEmpty();
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
