class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> mySet = new HashSet<>();
        for (int i: nums){
            mySet.add(i);
        }
        System.out.println(mySet);
        if (mySet.size() != nums.length){
            return true;
        }
        return false;
    }
}