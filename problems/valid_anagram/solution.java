class Solution {
    public boolean isAnagram(String s, String t) {
        int[] alphabet = new int[26];

        for (char c: s.toCharArray()){
            alphabet[c-97]++;
        }
        for (char d: t.toCharArray()){
            alphabet[d-97]--;
        }
        for (int e: alphabet){
            if (e != 0){
             return false;
            }
        }
        return true;
    }
}