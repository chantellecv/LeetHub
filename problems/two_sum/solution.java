class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result;
        HashMap<Integer, Integer> myMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++){

            int diff = target - nums[i];
            if (myMap.containsKey(diff)){
                result = new int[] {i, myMap.get(diff)};
                return result;
            }
            myMap.put(nums[i], i);
        }
        return new int[2];
    }
}