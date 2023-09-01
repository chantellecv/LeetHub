class MyQueue {

    Stack <Integer> myStack = new Stack<>();
    Stack <Integer> myStack2 = new Stack<>();


    public MyQueue() {
        
    }
    
    public void push(int x) {
        while (!myStack.empty()){
            myStack2.push(myStack.pop());
        }
        myStack.push(x);
        while (!myStack2.empty()){
            myStack.push(myStack2.pop());
        }
        System.out.println(myStack);

    }
    
    public int pop() {
        return myStack.pop();
    }
    
    public int peek() {
        return myStack.peek();
    }
    
    public boolean empty() {
        return myStack.empty();
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
