class Solution {
    public int majorityElement(int[] nums) {
        int max = Integer.MIN_VALUE;
        int res = 0;
        HashMap <Integer, Integer> numMap = new HashMap<>();
        for (int i: nums){
            numMap.put(i, numMap.getOrDefault(i, 0) + 1);
        }
        for (int i: numMap.keySet()){
            if (numMap.get(i) > max){
                max = numMap.get(i);
                res = i;
            }
        }
        return res;
        
    }
}