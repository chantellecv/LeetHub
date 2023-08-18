class Solution {
    public boolean isValid(String s) {
        Stack<Character> parStack = new Stack<>();
        for (char c: s.toCharArray()){
            if (c == '(' || c == '[' || c == '{'){
                parStack.push(c);
            }
            else if (c == '}' && !parStack.empty() && parStack.peek() == '{'){
                parStack.pop();
            }
            else if (c == ')' && !parStack.empty() && parStack.peek() == '('){
                parStack.pop();
            }
            else if (c == ']'  && !parStack.empty() && parStack.peek() == '['){
                parStack.pop();
            }
            else {return false;}
        }
        return parStack.empty();
    }
}