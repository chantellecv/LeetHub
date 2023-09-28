class Solution {
    public String longestCommonPrefix(String[] v) {

        StringBuilder sb = new StringBuilder();
        Arrays.sort(v);

        for (int i = 0; i < v[0].length(); i++){
            if (v[0].charAt(i) == v[v.length - 1].charAt(i)){
                sb.append(v[0].charAt(i));
            } else {
                return sb.toString();
            }
        }
        return sb.toString();
    }
}