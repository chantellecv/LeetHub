class Solution {
    public int longestPalindrome(String s) {
        int even = 0;
        int odd = 0;

        int[] alphabet = new int[58];

        for (char c: s.toCharArray()){
            alphabet[c-'A']++;
        }
     
        for (int i: alphabet){
            even += i/2 * 2;
            if (i%2 == 1){
                odd = 1;
            }
        }
        return even+odd;
    }
}