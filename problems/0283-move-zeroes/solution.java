class Solution {
    public void moveZeroes(int[] nums) {

        int j = 0, temp = 0;

        for (int i = 0; i < nums.length; i++){
            if (nums[i] != 0){
                nums[j] = nums[i];
                j++;
            }
        }
        System.out.println(j);
        for (int i = j; i< nums.length; i++){
            nums[i] = 0;
        }
    }
}
