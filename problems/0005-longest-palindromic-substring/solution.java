class Solution {
    public String longestPalindrome(String s) {
        if (s.length() == 0) return "";
        
        int start = 0, end = 0;
        for (int i = 0; i < s.length(); i++){  
        
            int odd = getPalindrome(s, i, i);
            int even = getPalindrome(s, i, i+1);
            int max = Math.max(odd, even);

            if (max > end-start){
                start = i - ((max-1)/2);
                end = i + max/2;
            }
        }
        return s.substring(start, end + 1 );
    }
    
    public int getPalindrome(String s, int left, int right){
        if (s.length() == 0) return 0;

        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
            left--;
            right++;            
        }
        
    
        System.out.println(right-left-1);
        return right-left-1;
    }
}
