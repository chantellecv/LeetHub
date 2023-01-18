class Solution {
    public boolean isAnagram(String s, String t) {
        int[] alpha = new int[26];

        for (char i:s.toCharArray()){
            alpha[i-97]++;
        }
        for (char j:t.toCharArray()){
            alpha[j-97]--;
        }
        for (int k:alpha){
            if (k!=0){
                return false;
            }
        }
        return true;
        
    }
}
