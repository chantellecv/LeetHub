class Solution {
    public int singleNumber(int[] nums) {

        HashMap<Integer, Integer> myMap = new HashMap<>();
        for (int i: nums){
            myMap.put(i, myMap.getOrDefault(i, 0) + 1);
        }
        for (int i: nums){
            if (myMap.get(i) == 1){
                return i;
            }
        }

        return 0;
        
    }
}