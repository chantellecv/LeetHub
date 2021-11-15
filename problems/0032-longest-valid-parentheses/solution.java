class Solution {
    public int longestValidParentheses(String s) {
        int max = 0;

        Stack<Integer> myStack = new Stack<>();
        myStack.push(-1);
        for (int i=0; i<s.length(); i++){
            if (s.charAt(i) == '('){
                myStack.push(i);
            }
            else{
                if (!myStack.empty()){
                    myStack.pop();
                    if (myStack.empty()){
                        myStack.push(i);
                    }
                    max = Math.max(max, i-myStack.peek());
                }
            }
        }
        return max;
    }
}
