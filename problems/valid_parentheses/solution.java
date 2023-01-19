class Solution {
    public boolean isValid(String s) {
        
        if (s.length() == 0 || s.length() %2 != 0){
            return false;
        }
        Stack<Character> myStack = new Stack<>();
        for (char i: s.toCharArray()){
            if (i == '(' || i == '[' || i == '{'){
                myStack.push(i);
            }
            else if (i == '}' && !myStack.empty() && myStack.peek()=='{'){
                myStack.pop();
            }
            else if (i == ']' && !myStack.empty()  && myStack.peek()=='['){
                myStack.pop();
            }
            else if (i == ')' && !myStack.empty()  && myStack.peek()=='('){
                myStack.pop();
            }
            else myStack.push(i);
        }
        return myStack.empty();
        
    }
}