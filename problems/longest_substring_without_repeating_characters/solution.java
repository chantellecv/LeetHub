class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        
        HashMap<Character, Integer> myMap = new HashMap<>();
        for (int j = 0, i = 0; j < s.length(); j++){
            char c = s.charAt(j);
            if (myMap.containsKey(c) ){
                i = Math.max(i, myMap.get(c));
            }
            myMap.put(c, j+1);
            max = Math.max(max, j-i+1);
        }
        return max;
    }
}