class Solution {
    public String decodeString(String s) {
        // Create two stacks: one for counts and one for partial results
        Stack<Integer> countStack = new Stack<>();
        Stack<String> resultStack = new Stack<>();
        
        int count = 0;
        StringBuilder sb = new StringBuilder();
        
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                // Calculate the count
                count = count * 10 + (c - '0');
            } else if (c == '[') {
                // Push the count onto the count stack
                countStack.push(count);
                // Push the current partial result onto the result stack
                resultStack.push(sb.toString());
                // Reset the count and current partial result
                count = 0;
                sb = new StringBuilder();
            } else if (c == ']') {
                // Pop the count from the count stack
                int repeatCount = countStack.pop();
                // Pop the previous partial result from the result stack
                StringBuilder prevResult = new StringBuilder(resultStack.pop());
                // Append the current partial result to the previous result count times
                for (int i = 0; i < repeatCount; i++) {
                    prevResult.append(sb);
                }
                // Update sb with the combined result
                sb = prevResult;
            } else {
                // Append characters to sb
                sb.append(c);
            }
        }
        
        // The final result is stored in sb
        return sb.toString();
    }
}

