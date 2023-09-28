class Solution {
    public int missingNumber(int[] nums) {

        HashSet<Integer> mySet = new HashSet<Integer>();
        for (int i: nums) mySet.add(i);

        for (int i = 0; i <= nums.length; i++){
            if (!mySet.contains(i)) return i;
        }
        return 0;
    }
}
