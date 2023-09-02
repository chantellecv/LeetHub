class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] alphabet = new int[26];
        for (char c: magazine.toCharArray()){
            alphabet[c-'a']++;
        }
        for (char d: ransomNote.toCharArray()){
            alphabet[d-'a']--;
        }
        for (int i: alphabet){
            if (i < 0){
                return false;
            }
        }
        return true;
    }
}