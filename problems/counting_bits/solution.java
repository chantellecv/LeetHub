class Solution {
    public int[] countBits(int n) {

        int[] counted = new int[n+1];

        for (int i = 1; i < n+1; i++){
            counted[i] = counted[i >> 1] + (i & 1);
        }
        return counted;
    }
}