package Assignment10;

import java.util.Stack;

public class min_Stack {
    class MinStack {
    Stack<Integer> st;
    Stack<Integer> stt;
    public MinStack() {
        // st=new Stack();
        // stt=new Stack();
    }
    
    public void push(int val) {
        stt.push(val);
        if(st.isEmpty()||val<=st.peek())
            st.push(val);
    }
    
    public void pop() {
        
        if(st.peek().equals(stt.peek()))
            st.pop();
        stt.pop();
        
    }
    
    public int top() {
        return stt.peek();
    }
    
    public int getMin() {
        return st.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
}
