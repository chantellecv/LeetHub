class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> sStack = new Stack<Character>();
        Stack<Character> tStack = new Stack<Character>();

        for (char c: s.toCharArray()){
            if (c != '#'){
                sStack.push(c);
            } else if (!sStack.empty()){
                sStack.pop();
            }
        }
        for (char c: t.toCharArray()){
            if (c != '#'){
                tStack.push(c);
            } else if (!tStack.empty()){
                tStack.pop();
            }
        }

        return sStack.equals(tStack);
    }
}
